package pets;

public class TestAnimals {
	public static void main(String[] args) {
        // Spider demonstration
        Spider spider = new Spider();
        spider.walk();
        spider.eat();

        System.out.println();

        // Cat demonstration (Polymorphism via Pet and Animal)
        Cat cat = new Cat("Fluffy");
        cat.walk();
        cat.eat();
        cat.play();

        System.out.println();

        // Fish demonstration
        Fish fish = new Fish();
        fish.setName("Nemo");
        fish.walk();
        fish.eat();
        fish.play();

        System.out.println();

        // Polymorphic array demonstration
        Animal[] animals = { new Spider(), new Cat("Whiskers"), new Fish() };
        for (Animal a : animals) {
            a.eat();
            if (a instanceof Pet) {
                ((Pet) a).play();
            }
        }
    }
}
