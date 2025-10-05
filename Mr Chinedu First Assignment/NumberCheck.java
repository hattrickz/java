import java.util.Scanner;

public class NumberCheck {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	// prompt user to enter a number and store it in a variable.
        System.out.print("Enter a number: ");
        int num = input.nextInt();
	// check if the number is 0 print zero if not 
        if (num == 0) {
            System.out.println("Zero");
        } 
	// check if number is greater than zero and if number is divisible by 2 	// without remainder print positive even if not 
	else if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Positive Even");
            }
	// print positive odd if not
	 else {
                System.out.println("Positive Odd");
            }

        }
	// check if number is less than 0 and if number is divisible by 2
	// without remainder print negative even if not 

	 else {             
		if (num % 2 == 0) {
                System.out.println("Negative Even");
              }
	// print negative odd if not

	 else {
                System.out.println("Negative Odd");
              }
        }

}
}