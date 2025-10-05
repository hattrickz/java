import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user to enter different numbers and store them it in variables

        System.out.print("Enter hours worked: ");
        int hours = input.nextInt();

        System.out.print("Enter hour rate: ");
        double rate = input.nextDouble();

        double totalpay;
	// check if less than or equals to 40 multiply the hours and rate to get the 	// totalpay if not
        if (hours <= 40) {
            totalpay = hours * rate;
        } 
	// check if not less than or equals to 40 multiply the hours,rate and times 	// 1.5 to get the totalpay

	else {
               totalpay = (hours * rate * 1.5);
        }

        System.out.println("Total pay = " + totalpay);

    }
}