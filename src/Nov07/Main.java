package Nov07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog browny = new Dog("Browny", 6, "White");
        System.out.println(browny);
        System.out.println(browny.name);
        browny.eat();
        browny.makeSound();
        browny.bark();

        Cat nyeko = new Cat("Nyeko", 2, "Orange");
        System.out.println(nyeko);
        System.out.println(nyeko.name);
        nyeko.eat();
        nyeko.meow();
        nyeko.makeSound();

        Animal anim = new DomesticatedCat("Anim", 5, "Brown");
//        Dog dog_anim = (Dog) anim;
//        dog_anim.bark();
//        Cat cat_anim = (Cat) anim;
//        cat_anim.meow();
        anim.makeSound();

        Fox foxy = new Fox("Foxy", 10);
        foxy.makeSound();
        foxy.eat();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(browny);
        animals.add(nyeko);
        animals.add(anim);
        animals.add(foxy);

        for (Animal a : animals) {
            a.makeSound();
            if (a instanceof Dog) {
                Dog d_animal = (Dog) a;
                d_animal.bark();
            }
        }
    }
}
