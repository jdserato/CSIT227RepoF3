package Nov07;

public abstract class Cat extends Animal{
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
}
