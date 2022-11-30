package Another;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean finished = false;
//        foo();
        do {
            try {
//                int[] array = new int[5];
//                System.out.println(array[10]);
                Scanner sc = null;
                System.out.print("Enter a: ");
                int a = sc.nextInt();
                System.out.print("Enter b: ");
                sc.nextLine();
                String str_b = sc.nextLine();
                int b = Integer.parseInt(str_b);
                int answer = a / b;
                System.out.println("Answer = " + answer);
                finished = true;
                throw new JayVinceException();
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Invalid input");
            } catch (IllegalArgumentException e) {

            } catch (Exception e) {
                System.out.println("An error occurred");
                System.err.println(e);
            }
        }while (false);
    }

    public static void foo() {
        foo();
        System.out.println("HELLO");
    }
}
