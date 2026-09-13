package pets;

public class Fish extends Animal implements Pet{
	private String name;

    public Fish() {
        super(0); // Fish have 0 legs
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
        System.out.println(name + " swims playfully in circles.");
    }

    @Override
    public void walk() {
        System.out.println("Fish cannot walk; it swims instead.");
    }

    @Override
    public void eat() {
        System.out.println("Fish eats algae and flakes.");
    }
}
