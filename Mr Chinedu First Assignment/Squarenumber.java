import java.util.Scanner;

public class Squarenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int square = 0;

        // add num to itself num times
        for (int i = 1; i <= num; i++) {
            square = square + num;
        }

        System.out.println("Square of " + num + " is: " + square);
    }
}