import java.util.Scanner;

public class sum_odd_even{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the limit: ");
		int lmt = sc.nextInt(); // Taking the limit input from the user....

		int even_sum = 0; int odd_sum = 0;
		for(int i = 0; i <= lmt; i++){
			// Logic inside the for loop....

			if(i % 2 == 0){
				// Logic of even numbers....
				even_sum += i;
			} else if(i % 2 != 0){
				// Logic of odd numbers....
				odd_sum += i;
			}else{
				System.out.println("Its not a number !!"); // If the condition is not satisfied
			}
		}
		System.out.println("Even number sum: "+even_sum);
		System.out.println("Odd number sum: "+odd_sum);
	}
}
// Program terminated.....
