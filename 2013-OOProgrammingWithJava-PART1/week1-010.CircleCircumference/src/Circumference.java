
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.print("Type the radius: ");
        double rad = Integer.parseInt(reader.nextLine());

        double circ = 2 * Math.PI * rad;

        System.out.println("Circumference of the circle: " + circ);


    }
}
