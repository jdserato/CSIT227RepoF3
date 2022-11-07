package Nov07;

public class Cat extends Animal{
    String cat_breed;
    String color;
    boolean gender_male;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void meow() {
        System.out.println(name + " says: Meow Meow");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + name + ": Meow Meow");
    }

    @Override
    public String toString() {
        return super.toString() + " which is a Cat";
    }
}
