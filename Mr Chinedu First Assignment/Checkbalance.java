import java.util.Scanner;

public class Checkbalance {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	// prompt user to enter account balance and store it in a variable.
        System.out.print("Enter your account balance: ");
        double balance = input.nextDouble();
	// check if balance is less than 100 print low if not
        if (balance < 100) {
            System.out.println("Low");
        } 
	// check if balance is less than or equals to 1000 print medium if not
	else if (balance <= 1000) {  
            System.out.println("Medium");
        } 
	// if balance is greater than 1000 print high

	else {
            System.out.println("High");
        }

        
}
}