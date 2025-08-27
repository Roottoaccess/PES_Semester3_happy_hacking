import java.util.Scanner;

public class do_while_loop{
	
	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the limit: ");

		int lmt = sc.nextInt(); // Taking the input from the user....

		// Applying the looping concept....

		int i = 0; // Initialize the value of i
		
		do{
		
			System.out.print(i + " ");
			i++; // Increment mechanism.....

		}while(i <= lmt);
	}
}


// Program terminated.......
