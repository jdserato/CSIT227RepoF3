package Nov07;
import Main.Human;

public class DomesticatedCat extends Cat {
    Human owner;
    public DomesticatedCat(String name, int age, String color) {
        super(name, age, color);
    }


    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
