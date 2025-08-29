import java.util.Scanner;

class single_char{
	
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		
		char ch;
		System.out.print("Enter any character: ");
		
		ch = sc.next().charAt(0);

		System.out.println("The single character is: "+ch);
	}

}
// program terminated.....
