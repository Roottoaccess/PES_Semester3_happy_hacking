import java.util.Scanner;


public class sum_n{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		// Coding the sum of n natural numbers using for loop....


		int num, sum = 0;

		System.out.print("Enter the natural number: ");
		num = sc.nextInt();

		for(int i = 1; i <= num; i++){

			sum += i;

		//	System.out.println("Sum: "+sum);
		}
		
		System.out.println("Sum: "+sum);
	}

}
// Program terminated....
