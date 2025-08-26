import java.util.Scanner;
public class switch_case{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int button; System.out.print("Enter the button (from 1 - 3): ");
		button = sc.nextInt(); // Taking the user input....
		
		// Using the switch statement for the execution....
		switch(button){
			case 1: System.out.println("Hello");
			break;
			
			case 2: System.out.println("Namaste");
			break;

			case 3: System.out.println("Bonjour");
			break;

			default:
				System.out.println("Invalid button pressed !!");
		}
	}
}
// Program terminated....
