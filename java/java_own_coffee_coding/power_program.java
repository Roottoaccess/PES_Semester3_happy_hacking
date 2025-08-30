import java.util.Scanner;

public class power_program{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // Rapper class....
			
		System.out.print("Enter the number: "); int num = sc.nextInt();

		System.out.print("Enter the power: "); int pow = sc.nextInt();
		
		int calculate = 1;
		for(int i = 1; i <= pow; i++){
			// Inner logic
			calculate *= num; 
		}
	System.out.println("Result: "+calculate);
	}	

}

// Program terminated.....
