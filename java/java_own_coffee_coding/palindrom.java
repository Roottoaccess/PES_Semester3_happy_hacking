import java.util.Scanner;

public class palindrom{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int num = sc.nextInt(); int c = num;
		int rem = 0;int store = 0;
		while(num > 0){ // Logic.....
			rem = num % 10;
			store = (store * 10) + rem;
			num = num / 10;		
		}
		if(c == store){
			System.out.println("Palindrom number....");
		} else{
			System.out.println("Not Palindrom number....");
		}
	}

}
// Program terminated.....
