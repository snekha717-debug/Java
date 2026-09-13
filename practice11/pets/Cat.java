package pets;

public class Cat extends Animal implements Pet {
	private String name;

    public Cat(String name) {
        super(4); // Cats have 4 legs
        this.name = name;
    }

    public Cat() {
        this(""); // Calls parameterized constructor with empty string
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " plays with a yarn ball.");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish and cat food.");
    }
}
