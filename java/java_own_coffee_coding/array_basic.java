import java.util.Scanner;

public class array_basic{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		// Creating the array....
		//int arr[] = {10,20,30,40};

		//System.out.print(arr[2]);

		//int a[] = new int[5];
		int size, i;

			System.out.print("Enter the size of the array: ");
			size = sc.nextInt();

		int arr[] = new int[size];

			for(i = 0; i < size; i++){
				
				arr[i] = sc.nextInt();

			}
			
		// Displaying the elements.....

		for(i = 0; i < size; i++){

			System.out.print(arr[i]+" ");
		}
	}
}
// Program terminated.........
