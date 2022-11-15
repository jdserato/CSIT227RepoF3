package Another;
import Nov07.Animal;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird " + name + ": Tweet Tweet");
    }
}
