import java.util.Scanner;
public class EvenOrOdd{
	public static void main(String [] args) {

	// prompt user to enter a number and store it in a variable 

	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = input.nextInt();

 	// Use control statement to check if the number is  divisible by 2 withour remainder
	// print "Even number" if not

	if (num % 2==0){
	System.out.print("Even number");
	}

	// check if the number is  divisible by 2 with a remainder
	// print "Even number" if not

	else if (num % 2 == 1){
	System.out.println("Odd number");
	}
	// if none of the condition was met print invalid
	else {
	System.out.print("invalid");
	}

}
}