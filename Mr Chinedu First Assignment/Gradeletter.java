import java.util.Scanner;
public class Gradeletter {
public static void main (String [] args){
// prompt user to enter grade letter and store it in a variable 

Scanner input = new Scanner(System.in);
System.out.println("Enter your grade letter");
String grade = input.next();

if (grade.equals("A") || grade.equals("B") || grade.equals("C")|| grade.equals("D") || grade.equals("E")){
	System.out.println("pass");
}
else if (grade.equals("F")){
System.out.println("fail");
}
else {
	System.out.print("invalid");
}

}
}