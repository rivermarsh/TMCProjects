import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        System.out.println("In reverse order: " + rev(name));
        }

    public static String rev(String word){
        int i = (word.length()-1);
        String x = "";

        while (i >= 0){

            x = x + word.charAt(i);
            i--;
        }
        return x;
    }
}
