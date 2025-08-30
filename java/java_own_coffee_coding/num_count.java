import java.util.Scanner;

public class num_count{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num = sc.nextInt();
	int count = 0; // Counter variable....
		while(num > 0){
			num = num / 10;
			count++;
		}

		// Printing the result....

		System.out.println("The digit present in the number is: "+count);
	}
}
// Program terminated.....
