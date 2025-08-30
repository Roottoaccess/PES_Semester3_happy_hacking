import java.util.Scanner;

public class square_root{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		double res = Math.sqrt(num); // Math -> class , sqrt -> method

		System.out.println("Square root: "+res);
	}
}
// Program Terminated.....
