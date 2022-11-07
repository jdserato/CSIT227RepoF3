package Nov07;

public class Dog extends Animal {
    String dog_breed;
    String color;
    boolean gender_male;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void bark() {
        System.out.println(name + " says: Aw Aw");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + name + ": Arf Arf");
    }

    @Override
    public String toString() {
        return "Dog " + name + " with age " + age + " and color " + color;
    }
}
