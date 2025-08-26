import java.util.Scanner;

public class odd_even{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int num; System.out.print("Enter any number: ");
		num = sc.nextInt();// Taking the user input....

		// Applying the conditional statement....
		if(num % 2 == 0){ // Logic of the code....
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}
}
// Program terminated....
