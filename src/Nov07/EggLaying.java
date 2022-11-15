package Nov07;

public interface EggLaying {
    int HARD_EGG = 1;
    int SOFT_EGG = 2;

    Animal layEgg();
    int typeOfEgg();

    default void labor() {
        System.out.println("I am in labor");
    }
}
