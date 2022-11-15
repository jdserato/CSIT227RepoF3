package Nov07;

import java.util.Comparator;
import java.util.Date;

public abstract class Animal implements Comparable<Animal> {
    protected String name;
    Date birthday;
    private int age;
    public static final String SAMPLE = "SAMPLE";

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.birthday = new Date();
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return name + " (" + age + ") " + birthday;
    }

    @Override
    public int compareTo(Animal o) {
        return o.name.compareTo(this.name);

    }

    public static class AnimalAgeComparator implements Comparator<Animal> {

        @Override
        public int compare(Animal o1, Animal o2) {
            if (o1.age < o2.age) {
                return -1;
            }
            if (o1.age == o2.age) {
                return 0;
            }
            return 1;
        }
    }

    public static class AnimalBirthComparator implements Comparator<Animal> {

        @Override
        public int compare(Animal o1, Animal o2) {
            return o1.birthday.compareTo(o2.birthday);
        }
    }
}
