import java.util.Scanner;

public class while_loop{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
	// Taking the limit input from the user....
		System.out.print("Enter the limit: ");
		int lmt = sc.nextInt();

		// Applying while loop concept .....
		
		int i = 0;
		while(i <= lmt){
			
			System.out.print(i+" ");
			i++; // Increamenting
		}
	}
}

// Program terminated.....
