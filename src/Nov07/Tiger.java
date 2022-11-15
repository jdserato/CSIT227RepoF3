package Nov07;

public class Tiger extends Cat{
    public Tiger(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void makeSound() {
        System.out.println("ROWR");
    }
}
