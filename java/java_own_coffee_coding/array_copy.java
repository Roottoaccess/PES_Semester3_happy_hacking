import java.util.Scanner;
public class array_copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int a[] = new int[size];

        for(int i = 0; i < size; i++){
            a[i] = sc.nextInt(); // Taking the input of the array.....
        }

        System.out.println("Displaying the array......");

        for(int i = 0; i < size; i++){
            System.out.println(a[i]);
        }
        // Copying the element in the second array.....
        System.out.println("Displaying the second array.......");
        int b[] = new int[size];
        for(int i = 0; i < size; i++){
            b[i] = a[i];
            System.out.println(b[i]);
        }
    }
}

// Program terminated