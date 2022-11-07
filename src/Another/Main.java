package Another;
import Main.Human;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.x1);
        System.out.println(r.x2);

        Rectangle r1 = new Rectangle(5, 7, 9, 11);
        System.out.println(r1.y1);
        System.out.println(r1.y2);
    }
}
