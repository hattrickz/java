import java.util.Scanner;
public class Temperature {
public static void main (String [] args){
	// prompt user to enter temperature and store it in a variable.

	Scanner input = new Scanner(System.in);
	System.out.println("Enter temperature in celsius");
	int temp = input.nextInt();
	// Check if the number is less than zero print freezing if not

	if (temp < 0){
	System.out.println("Freezing");
	}
	// check if the number is greater than 0 or equals to and less than equals 	//to 15 if not

	else if(temp >= 0 && temp <= 15){
	System.out.println("Cold");
	}

	// check if the number is greater than 16 or equals to and less than 	//equals to 25 if not

	else if(temp >= 16 && temp <= 25){
	System.out.println("Warm");
	}

	// display "hot"
	else{
	System.out.println("Hot");
	}


}
}