import java.util.*;

public class age_code{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int age;
			System.out.print("Enter your age: ");
			age = sc.nextInt();
	// Applying the conditional statement.....
		if(age >= 18){
			System.out.println("You are an adult");
		} else {
			System.out.println("You are still a kid now");
		}
	}
}
