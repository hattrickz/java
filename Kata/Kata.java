import java.util.Scanner;

public class Kata {
public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it's even: ");
        int number1 = input.nextInt();
        if (number1 % 2 == 0) {
            System.out.println(number1 + " is even");
        } 
	else {
            System.out.println(number1 + " is odd");
        }

    
        System.out.print("\nEnter a number to check if it's prime: ");
        int number2 = input.nextInt();
        boolean isPrime = true;
        if (number2 <= 1) {
            isPrime = false;
        } 
	else {
            for (int i = 2; i < number2; i++) {
                if (number2 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number2 + " is a prime number");
        } 
	else {
            System.out.println(number2 + " is not a prime number");
        }

        System.out.print("\nEnter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int difference;
        if (a > b) {
            difference = a - b;
        } 
	else {
            difference = b - a;
        }
        System.out.println("The positive difference is " + difference);

        System.out.print("\nEnter two numbers to divide: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if (y == 0) {
            System.out.println("Cannot divide by 0. Result = 0");
        }
	 else {
            System.out.println("Result = " + (float)x / y);
        }

        System.out.print("\nEnter a number to count its factors: ");
        int num = input.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        System.out.println("Number of factors: " + count);

        System.out.print("\nEnter a number to check if it's a square: ");
        int sq = input.nextInt();
        boolean isSquare = false;
        for (int i = 1; i * i <= sq; i++) {
            if (i * i == sq) {
                isSquare = true;
                break;
            }
        }

        if (isSquare) {
            System.out.println(sq + " is a square number");
        } 
	else {
            System.out.println(sq + " is not a square number");
        }

        System.out.print("\nEnter a 5-digit number to check palindrome: ");
        int num7 = input.nextInt();
        int original = num7;
        int reversed = 0;
        while (num7 > 0) {
            int digit = num7 % 10;
            reversed = reversed * 10 + digit;
            num7 = num7 / 10;
        }
        if (original == reversed) {
            System.out.println("It is a palindrome");
        } 
	else {
            System.out.println("It is not a palindrome");
        }

        System.out.print("\nEnter a number to find factorial: ");
        int num8 = input.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num8; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial is " + factorial);

        System.out.print("\nEnter a number to find its square: ");
        int num9 = input.nextInt();
        int result = 0;
        for (int i = 0; i < num9; i++) {
            result = result + num9;
        }
        System.out.println("Square of " + num9 + " is " + result);
}
}