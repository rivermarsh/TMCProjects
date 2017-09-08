public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int star = 1;
        int white = (size-1);
        while (star <= size){
            printWhitespaces(white);
            printStars(star);
            star++;
            white--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int spaces = height-1;
        int stars = 1;

        while (spaces >= 0){
            printWhitespaces(spaces);
            printStars(stars);

            spaces --;
            stars +=2;
        }

        spaces = height - 2;
        stars = 3;

        printWhitespaces(spaces);
        printStars(stars);
        printWhitespaces(spaces);
        printStars(stars);

       /* int i = 1;
        int x = 1;
        int white = (height-1);
        while (x <= height){
            printWhitespaces(white);
            printStars(i);
            i += 2;
            x ++;
            white--;
        }
        printWhitespaces((height/2));
        printStars(3);
        printWhitespaces((height/2));
        printStars(3);*/
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(4);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
        System.out.println("---");
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
