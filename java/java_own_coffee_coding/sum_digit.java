import java.util.Scanner;
public class sum_digit{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int num; System.out.print("Enter the number: ");
		num = sc.nextInt();
		
		int rem, sum = 0;
		while(num > 0){
			rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println("Sum of digit: "+sum);
	}

}
// Program terminated.....
