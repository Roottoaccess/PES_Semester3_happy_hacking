import java.util.Scanner;

public class student_info{
	
	public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter your name: ");
	String name = sc.nextLine();

	System.out.print("Enter your roll-no: ");
	int roll = sc.nextInt();

	sc.nextLine();

	System.out.print("Enter your department: ");
	String department = sc.nextLine();

	// Displaying the student info below....

	System.out.println("Name: "+name+", roll-no: "+roll+" student department: "+department);
	}
}
// program terminated.....
