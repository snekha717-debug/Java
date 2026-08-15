package practice6;
class Animal {
    String species; // default access

    public Animal(String species) { // Made public so we can instantiate it anywhere
        this.species = species;
    }

    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}
public class Main2 {
	public static void main(String[] args) {
        Animal myAnimal = new Animal("Lion");
        
        System.out.println("Direct variable access -> Species: " + myAnimal.species); 
        
        // NO ERROR: We can also call the default method
        myAnimal.displaySpecies();
	}
}
