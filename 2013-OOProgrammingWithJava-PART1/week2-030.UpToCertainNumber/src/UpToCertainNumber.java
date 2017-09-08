
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 1;

        // Write your code here
        System.out.print("Up to what number?: ");
        int num = Integer.parseInt(reader.nextLine());

        while (count <= num){
            System.out.println(count);
            count ++;
        }
        
    }
}
