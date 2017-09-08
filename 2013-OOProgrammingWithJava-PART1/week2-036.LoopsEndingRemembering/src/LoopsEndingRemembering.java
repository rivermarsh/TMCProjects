import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        double count = 0;
        double sum = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Type numbers: ");
        while (true) {
            int x = Integer.parseInt(reader.nextLine());
            if (x != -1) {
                if ((x % 2)== 0) {
                    sum += x;
                    even += 1;
                    count++;
                } else {
                    sum += x;
                    odd += 1;
                    count++;
                }
            }
            if (x == -1){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + (int)sum);
                System.out.println("How many numbers: " + (int)count);
                System.out.println("Average: " + (sum / count));
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                break;
            }
        }
    }
}
