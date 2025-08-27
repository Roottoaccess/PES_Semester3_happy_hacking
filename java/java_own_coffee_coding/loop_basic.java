// Scripting the loop code in java.....
import java.util.Scanner;

public class loop_basic{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);
		
		// Taking the string input from the user and displaying it n'th times....

		System.out.print("Enter the message for the server: ");
		String message = sc.nextLine(); // Taking the long string input.....

		// How many times you want to print it (taking the input from the user)
		
		System.out.print("Enter the number of times you want to display the message: ");
		int limit = sc.nextInt();

		// Applying the logic....
		for(int i = 0; i < limit; i++){
			System.out.println("Message from the Host1: "+message);
		}
			
	}
}
// Program terminated.....
