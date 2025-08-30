import java.util.Scanner;

class fact{
	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number: ");

		long num = sc.nextLong();

		// Logic behind the program....
		long fact = 1;
		for(long i = num; i >= 1; i--){
			fact *= i;
		}
		System.out.println("The factorial result: "+fact);
	}
}
// Program terminated......
