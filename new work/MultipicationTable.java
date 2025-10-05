import java.util.Scanner;
public class MultipicationTable {
public static void main (String [] args){
// prompt user to enter a number and store it in a variable.

Scanner input = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = input.nextInt();
//Assign a variable to store the multiple

int count = 0;
int result = 0;

// when count is less than 12 multiple number by count and store then add 1 //to count and repeat the process.

while( count < 12){

result = num * count;
count+=1;

// print 7 x 1 = 0
// 7 x 2 = 7
// 7 x 3 = 14
// 7 x 4 = 21
// 7 x 5 = 28
// 7 x 6 = 35
// 7 x 7 = 42
// 7 x 8 = 49
// 7 x 9 = 56
// 7 x 10 = 63
// 7 x 11 = 70
// 7 x 12 = 77
// 7 x 13 = 84

System.out.printf("%d x %d = %d %n ", num, count, result);


}

}
	
}