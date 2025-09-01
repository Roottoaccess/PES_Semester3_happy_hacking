import java.util.Scanner;

public class search_array{
	
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i = 0;i < size; i++){
			arr[i] = sc.nextInt(); // Taking the input.....
		}
		System.out.print("Enter the element to search: ");
		int key = sc.nextInt();
		int count = 0;
		for(int i = 0; i < size; i++){
			if(key == arr[i]){
				count++;

			}
		}
		if(count > 0){
			System.out.println("Element found in the array "+count+" time");
		} else {
			System.out.println("Element not found in the array....");
		}
	}
}
// Program terminated.....
