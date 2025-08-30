import java.util.Scanner;

public class swap_two{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int x,y; System.out.print("Enter first: "); x = sc.nextInt();
		System.out.print("Enter second: "); y = sc.nextInt();
		
		System.out.println("Before swapping x: "+x+" y: "+y);		

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After swapping x: "+x+" y: "+y);
	}
}
// Program terminated.....
