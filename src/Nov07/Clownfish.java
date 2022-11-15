package Nov07;

public class Clownfish extends Fish {
    public Clownfish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Clownfish " + name + ": Blooob");
    }

    @Override
    public Animal layEgg() {
        return new Clownfish("Omen", 0);
    }
}
