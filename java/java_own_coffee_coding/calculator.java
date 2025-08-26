import java.util.Scanner;

public class calculator{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		float num1, num2; // Taking the input of the two numbers.....

		System.out.print("Enter the first number: ");
		num1 = sc.nextFloat();

		System.out.print("Enter the second number: ");
		num2 = sc.nextFloat();

		char choice; // Taking the operation to be executed from the user....
		System.out.print("Enter the operation to be performed => ('+','-','*','/','%'): ");
		choice = sc.next().charAt(0);  // For taking the input as a single character.....
	float result;
		switch(choice){
			
			case '+':
				result = num1 + num2; System.out.println("Result: "+result);
				break;
			case '-':           
                                result = num1 - num2; System.out.println("Result: "+result);      
                                break;
			case '*':           
                                result = num1 * num2; System.out.println("Result: "+result);      
                                break;
			case '/':           
                                result = num1 / num2; System.out.println("Result: "+result);      
                                break;
			case '%':           
                                result = num1 % num2; System.out.println("Result: "+result);      
                                break;
			default:
				System.out.println("you have entered an invalid operation !!");
		}
	}	
}
