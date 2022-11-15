package Nov07;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Dog browny = new Dog("Browny", 6, "White");
        System.out.println(browny);
        System.out.println(browny.name);
        browny.eat();
        browny.makeSound();
        browny.bark();

        Cat nyeko = new DomesticatedCat("Nyeko", 2, "Orange");
        System.out.println(nyeko);
        System.out.println(nyeko.name);
        nyeko.eat();
        nyeko.meow();
        nyeko.makeSound();

        Animal anim = new Dog("Meowy", 5, "Brown");
        Tiger liger = new Tiger("Liger", 7, "Orange");
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(liger);
        cats.add(nyeko);
        for (Cat c : cats) {
            c.makeSound();
        }

        Fox foxy = new Fox("Foxy", 10);
        foxy.makeSound();
        foxy.eat();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(browny);
        animals.add(nyeko);
        animals.add(anim);
        animals.add(foxy);
        Mammal whale = new Whale("Orca", 5);
        animals.add(whale);
        Penguin pangu = new Penguin("Pangu", 6);
        animals.add(pangu);
        Fish nemo = new Clownfish("Nemo", 2);
        animals.add(nemo);
        new Clownfish("Blabla", 7);
        new Clownfish("Blabla2", 7);
        new Clownfish("Blabla3", 7);
        nemo.print_fishes();
        Platypus candace = new Platypus("Candace", 7);
        animals.add(candace);
        System.out.println("SORTING BY NAME using COMPARABLE");
        // Comparable
        Collections.sort(animals);
        for (Animal a : animals) {
            System.out.println(a);
//            a.makeSound();
//            if (a instanceof Dog) {
//                Dog dog = (Dog) a;
//                dog.bark();
//            }
//            if (a instanceof Swimmer) {
//                Swimmer s = (Swimmer) a;
//                s.swim();
//                s.dive();
//            }
//            if (a instanceof EggLaying) {
//                EggLaying e = (EggLaying) a;
//                e.labor();
//                Animal n_anim = e.layEgg();
//                n_anim.makeSound();
//            }
        }
        Collections.sort(animals, new Animal.AnimalAgeComparator());
        System.out.println("SORTING BY AGE using COMPARATOR");
        for (Animal a : animals) {
            System.out.println(a);
        }
        Collections.sort(animals, new Animal.AnimalBirthComparator());
        System.out.println("SORTING BY BIRTHDAY using COMPARATOR");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
