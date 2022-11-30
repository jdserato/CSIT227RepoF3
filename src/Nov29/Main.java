package Nov29;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedReader br= new BufferedReader(new FileReader("src/sectionf3.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("writef3.txt", false))) {
            System.out.println("FILE has been found");
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            for (int i = 0; i < 15; i++) {
                bw.write(sc.nextLine());
                bw.newLine();
                if (i % 3 == 0) {
                    bw.flush();
                }
            }
        } catch (IOException e) {
            System.out.println("IO Exception caught " + e);
        }
    }

    static public void getLine(FileReader fr) throws IOException {
        char ch = (char) fr.read();
        while (!(ch == '\n' || ch == '\uFFFF')) {
            System.out.print(ch);
            ch = (char) fr.read();
        }
        System.out.println();
    }

    private void shape_load_file() {
        // GET ALL MY SHAPES
        try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                String str_radius = str.substring(str.indexOf(":")+1, str.indexOf(","));
                String str_color = str.substring(str.indexOf(",")+1);
                System.out.println("Radius: " + str_radius);
                System.out.println("Color: " + str_color);
                Double dbl_radius = Double.parseDouble(str_radius);
                /**
                 * The following line commented out since Circle and Shape are not in this package
                 */
//                shapes.add(new Circle(dbl_radius, str_color));
            }
        } catch (IOException e) {
            // do nothing
        }
    }

    private void shape_save_file() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("shapes.txt"))) {
            /**
             * The following lines commented out since Circle and Shape are not in this package
             */
//            for (Shape s : shapes) {
//                if (s instanceof Circle) {
//                    Circle c = (Circle) s;
//                    bw.write("Circle:"+c.getRadius()+","+c.color);
//                    bw.newLine();
//                }
//            }
        } catch (IOException e) {
            // do nothing
        }
    }
}
