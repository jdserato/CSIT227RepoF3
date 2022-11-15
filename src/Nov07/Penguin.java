package Nov07;

public class Penguin extends Bird implements Swimmer {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin " + name + ": Not Not");
    }

    @Override
    public void swim() {
        System.out.println("Penguin " + name + " is swimming");
    }

    @Override
    public void dive() {
        System.out.println("Penguin is diving");
    }

    @Override
    public Animal layEgg() {
        return new Penguin("HappyFeet", 0);
    }
}
