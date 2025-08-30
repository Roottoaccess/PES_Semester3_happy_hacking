import java.util.Scanner;
import java.lang.Character;
// Writting the logic of the program....
class convert{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any character: ");
		char ch = sc.next().charAt(0);

		char ch2; // Initializing this vaiable to store the result.....

		if(ch >= 'A' && ch <= 'Z'){
			ch2 = Character.toLowerCase(ch);
			System.out.println("lowercase: "+ch2);
		}
		else{
			ch2 = Character.toUpperCase(ch);
			System.out.println("uppercase: "+ch2);
		}
	}
}
// Program terminated....
