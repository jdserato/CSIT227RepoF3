package Main;

public class Main {
    public static void main(String[] args) {
        Human.cry();
        Human h;
        h = new Human();
//        h.setName( "Jay Vince Serato");
        h.talk();
        System.out.println(Human.SPECIES);
        System.out.println(Human.human_count);

        Human h1 = new Human("Leonardo", 17, true);
        System.out.println(h1.getName());
        h1.talk();
        Human h2 = h1;
        System.out.println(Human.human_count);
//        h2.setName("Marie Curie");
        System.out.println(h2.getName());
        System.out.println(h1.getName());
//        h1.setName("Hannah Montana");
        System.out.println(h2.getName());
        System.out.println(h1.getName());
    }

}