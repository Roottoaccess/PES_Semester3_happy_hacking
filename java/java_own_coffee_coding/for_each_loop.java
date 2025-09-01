import java.util.Scanner;

public class for_each_loop{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the limit: ");
		int lmt = sc.nextInt();
		
		int arr[] = new int[lmt];
		
		for(int i = 0; i < lmt; i++){

			arr[i] = sc.nextInt(); // Taking the input from the user....
		}
		System.out.println("Displaying the array.....");
		for(int b : arr){ // Using the foreach loop concept.....

			System.out.print(b+" ");
		}
	}
}
// Program terminated.....
