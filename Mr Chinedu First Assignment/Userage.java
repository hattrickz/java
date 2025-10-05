 import java.util.Scanner;
public class Userage{
	public static void main (String [] args){

	// prompt user to enter their age and store it in a variable

	Scanner input = new Scanner(System.in);
	System.out.println("Enter your age : ");
	int age = input.nextInt(); 

	// check if age is less than or equal to 12 then print "child" if not 
 
	if(age <= 12){
	System.out.print("child");
	}

	// check if age is graeter than or equal to 13 and age is less than or equal to   	// 19 then print "teen" if not 

	else if(age >= 13 && age <=19){
	System.out.print("teen");
	}

	// check if age is greater than or equal to 20 and age is less than or equal to   	// 59 then print "adult" if not 


	else if(age >= 20 && age <=59){
	System.out.print("adult");
	}
	
	// check if age is greater than or equal to 60 then print "senior" 

	else if (age >= 60){
	System.out.print("senior");
	}


}
}