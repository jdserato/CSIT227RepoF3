package Another;
import Main.Human;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // WRAPPER CLASS int - Integer
        // char - Character
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(90);
        numbers.add(13);
        numbers.add(69);
        numbers.add(0);
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
        Collections.sort(numbers);
        System.out.println();
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
    }
}
