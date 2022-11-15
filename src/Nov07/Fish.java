package Nov07;

public abstract class Fish extends Animal implements Swimmer, EggLaying{
    public static int number_of_fishes = 0;
    public Fish(String name, int age) {
        super(name, age);
        number_of_fishes++;
    }

    @Override
    public void makeSound() {
        System.out.println("Fish " + name + ": Blob Blob");
    }

    static void print_fishes() {
        System.out.println("FISH COUNT: " + number_of_fishes);
    }

    @Override
    public void swim() {
        System.out.println("Fish " + name + " is swimming");
    }

    @Override
    public void dive() {
        System.out.println("Fish dives down");
    }

    @Override
    public int typeOfEgg() {
        return SOFT_EGG;
    }
}
