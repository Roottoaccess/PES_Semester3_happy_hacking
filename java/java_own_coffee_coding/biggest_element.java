import java.util.Scanner;

public class biggest_element{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("Enter the digits.....");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt(); // Taking the input from the user....
		}
		int max = arr[0];

		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("The biggest number for the array is: "+max);
	}
}
// Program ended......
