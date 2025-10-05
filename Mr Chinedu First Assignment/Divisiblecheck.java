import java.util.Scanner;

public class DivisibleCheck {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	// prompt user to enter a number and stoer it in a variable.

        System.out.print("Enter a number: ");
        int num = input.nextInt();

	// check if number is divisible by 3 and number is divisible by 5 print 	//divisible by both if not 

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Divisible by both");
	// check if number is divisible by 3 print divisible by 3 if not 
        } else if (num % 3 == 0){
            System.out.println("Divisible by 3");
	// check if number is divisible by 5 print divisible by 5 if not
        } else if (num % 5 == 0){
            System.out.println("Divisible by 5");
	// print not divisible
        } else {
            System.out.println("Not divisible");
        }
}
}