package Main;

public class Human {
    // FIELDS or Instance Variables -- what do they have
    static int human_count = 0;
    private String name;
    private Human parent;
    int age;
    boolean gender_male;


    public static final String SPECIES = "Homo Sapiens";

    // METHODS -- what do they do
    public Human() {
        this("Juan Dela Cruz", 27, true);
//        name = "Juan Dela Cruz";
//        age = 27;
//        gender_male = true;
    }

    public Human(Human parent) {
        this.parent = parent;
    }

    public Human(int age, String name, boolean gender_male) {
        this(name, age, gender_male);
    }

    public Human(String name, int age, boolean gender_male) {
        this.name = name;
        this.age = age;
        this.gender_male = gender_male;
        human_count++;
    }

    public void talk() {
        System.out.println(name + ": Hi!");
    }

    public static void cry() {
        System.out.println("UWAA");
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
