
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        int sum = 0;
        int power = 0;

        while (power <= num){
            sum += ((int)Math.pow(2, power));
            power ++;

        }

        System.out.println("The result is " + sum);



    }
}
