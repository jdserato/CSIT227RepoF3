package Nov07;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
