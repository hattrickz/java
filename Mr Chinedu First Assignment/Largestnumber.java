import java.util.Scanner;
public class Largestnumber{
	public static void main (String [] args){
	
//	prompt user to enter three number and store them in different variables.

	Scanner input = new Scanner(System.in);
	System.out.println("Enter the First number :");
	int num1 = input.nextInt();
	System.out.println("Enter the second number :");
	int num2 = input.nextInt();
	System.out.println("Enter the third number :");
	int num3 = input.nextInt();
	
//	use a control statement to compare the three numbers to get the largest
	
	if (num1 >= num2 && num1 >=num3 ){
	System.out.println(num1);
	}
	else if (num2 >= num1 && num2 >=num3 ){
	System.out.println(num2);
	}
	else if (num3 >= num1 && num3 >=num2 ){
	System.out.println(num3);
	}
	
//	print the largest number

}
}