import java.util.Scanner;

public class ascii{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Character: ");
		char ch = sc.next().charAt(0); // Taking the character input....

		int con = ch;
		System.out.println("The ascii value of: "+ch+" is: "+con);
	}

}

// Program terminated.....
