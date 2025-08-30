import java.util.Scanner;

class reverse_num{

	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int rem = 0;
		while(n > 0){
			rem = n % 10; // Accessing the last element
			System.out.print(rem); // Printing be the order
			n = n / 10; // Updating the value of n to pass it again
		}
	}
}
// Program terminated.....
