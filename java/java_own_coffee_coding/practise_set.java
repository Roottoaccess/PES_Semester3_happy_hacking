import java.util.Scanner;

public class practise_set{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		// Calling the armstring function....
		

		System.out.print("Enter your choice (1 for Armstrong and 2 for Palindrom): ");
		int choice = sc.nextInt();

		switch(choice){
			case 1:
				armstrong(num);
				break;
			case 2:
				palindrom(num);
				break;
			default:
				System.out.println("Enter correct choice !!");
		}
	}
	// Armstrong logic function....
	public static void armstrong(int num){
		int original = num;
		int rem = 0, arm = 0;
		while(num > 0){
			rem = num % 10;
			arm = (rem * rem * rem) + arm;
			num /= 10;
		}
		if(original == arm){
			System.out.println("Number is armstrong....");
		} else {
			System.out.println("Number is not armstrong....");
		}
	}
	// Logic for palindrom function....
	public static void palindrom(int num){
		int original = num;
		int rem = 0,store = 0;
		
		while(num > 0){
			rem = num % 10;
			store = (store * 10) + rem;
			num = num / 10;
		}
		if(original == store){
			System.out.println("Numnber is palindrom....");
		} else {
			System.out.println("Number is not palindrom.....");
		}
	}
}
// Program terminated.........
