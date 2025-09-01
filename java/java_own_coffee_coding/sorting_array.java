import java.util.Scanner;

public class sorting_array{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("Enter the 5 elements in the array.....");
		for(int i = 0;i < arr.length; i++){
		
			arr[i] = sc.nextInt(); // Taking the input of the array.....
		}
		System.out.println("Array before sorting......");
		for(int b: arr){
			System.out.println(b);
		}
		System.out.print("Enter 1 for asending order sorting and 2 for decending order sorting: ");
		
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				acending(arr);
				break;
			case 2:
				decending(arr);
				break;
			default:
				System.out.println("Wrong input !!!!");
		}
	}

	public static void acending(int arr[]){
		for(int i = 0; i < arr.length; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					// swapping....
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array after sorting......");
		for(int b: arr){
			System.out.println(b);
		}
	}

	public static void decending(int arr[]){
		for(int i = 0; i < arr.length; i++){
                        for(int j = i + 1; j < arr.length; j++){
                                if(arr[i] < arr[j]){
                                        // swapping....
                                        int temp = arr[i];
                                        arr[i] = arr[j];
                                        arr[j] = temp;
                                }
                        }
                }
                System.out.println("Array after sorting......");
                for(int b: arr){
                        System.out.println(b);
                }
	}	
}
// Program terminated.....
