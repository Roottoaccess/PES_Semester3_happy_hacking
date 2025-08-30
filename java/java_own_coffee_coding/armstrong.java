import java.util.Scanner;

class armstrong{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Taking the input from the user....
		System.out.print("Enter the number: ");
		int num = sc.nextInt();

		int store = num; int rem = 0;int arm = 0;

		while(num > 0){
			rem = num % 10;
			arm = (rem * rem * rem) + arm;
			num /= 10;
		}
		if(store == arm){
			System.out.println("Armstrong number !!");
		} else{
			System.out.println("Not armstrong number !!");
		}
	}

}
// Program terminated.....
