package Nov07;

public class DomesticatedCat extends Cat{
    public DomesticatedCat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public String toString() {
        return super.name;
    }
}
