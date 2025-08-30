import java.util.Scanner;

public class average{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the marks of maths: ");
		int maths = sc.nextInt();

		System.out.print("Enter the marks of computer: ");
                int computer = sc.nextInt();

		System.out.print("Enter the marks of physics: ");
                int physics = sc.nextInt();

		System.out.print("Enter the marks of algorithm: ");
                int algorithm = sc.nextInt();

		// Average calculation....

		int average = (maths + computer + physics + algorithm) / 4;

		System.out.println("The average is: "+average);
	}
}
