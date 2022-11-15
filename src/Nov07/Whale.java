package Nov07;

public class Whale extends Mammal implements Swimmer {
    public Whale(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Whale " + name + ": ooOOOOOOoooOO");
    }

    @Override
    public void swim() {
        System.out.println("The whale " + name + " is swimming");
    }

    @Override
    public void dive() {
        System.out.println("Whale dives up");
    }
}
