package Nov07;

public class Fox extends Animal{
    public Fox(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Fox " + name + ": Nyi Nyi");
    }
}
