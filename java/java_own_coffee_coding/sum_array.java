import java.util.Scanner;

public class sum_array{
	
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i = 0;i < size; i++){
			arr[i] = sc.nextInt(); // Taking the input.....
		}

		int sum = 0;

		for(int i = 0; i < size; i++){
			sum += arr[i];
		}
		System.out.println("Sum of thr array element: "+sum);
	}
}
// Program terminated.....
