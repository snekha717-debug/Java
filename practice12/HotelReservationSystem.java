package practice12;

// Custom User-Defined Exception
class InvalidReservationException extends Exception {
    public InvalidReservationException(String message) {
        super(message);
    }
}

// HotelRoom Class
class HotelRoom {
    private int availableSlots;

    public HotelRoom(int initialSlots) {
        this.availableSlots = initialSlots;
    }

    public void reserveSlots(int slots) throws InvalidReservationException {
        if (slots <= 0) {
            throw new InvalidReservationException("Invalid reservation request: Number of slots requested must be greater than zero. (Given: " + slots + ")");
        }

        if (slots > availableSlots) {
            System.out.println("Reservation failed: Only " + availableSlots + " slots available, but " + slots + " requested.");
            return;
        }

        availableSlots -= slots;
        System.out.println("Successfully reserved " + slots + " slots. Remaining slots: " + availableSlots);
    }

    public int getAvailableSlots() {
        return availableSlots;
    }
}

// Driver / Main Class
public class HotelReservationSystem {
    public static void main(String[] args) {
        HotelRoom room = new HotelRoom(10);

        // Test Case 1: Valid reservation
        try {
            System.out.println("Attempting to reserve 3 slots...");
            room.reserveSlots(3);
        } catch (InvalidReservationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println();

        // Test Case 2: Zero slots (triggers custom exception)
        try {
            System.out.println("Attempting to reserve 0 slots...");
            room.reserveSlots(0);
        } catch (InvalidReservationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println();

        // Test Case 3: Negative slots (triggers custom exception)
        try {
            System.out.println("Attempting to reserve -2 slots...");
            room.reserveSlots(-2);
        } catch (InvalidReservationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}