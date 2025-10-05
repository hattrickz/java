import java.util.Scanner;

public class Lcm {
public static void main(String [] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = input.nextInt();

int div = 2;
int count  = 0;



while(num > 1 ){
	while (num % div != 0){
	div++;	
}
	count = count + div;
	num = num / div;
		
}
	System.out.printf("lcm 0f : %d ", count);
}
}