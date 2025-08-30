import java.util.Scanner;

public class even_n{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the limit: ");
		int lmt = sc.nextInt(); // Taking the input from the user.....

		for(int i = 0;i <= lmt; i++){
		// Logic inside the loop....

			if(i % 2 == 0){
				System.out.print(i+" ");
			}

		}
	}
}
// Program terminated....
