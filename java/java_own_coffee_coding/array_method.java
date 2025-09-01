import java.util.Arrays;
public class array_method{
	
	public static void main(String[]args){

		String arr[] = {"Hello","from","Server","Side"};

		System.out.println("toString(): "+Arrays.toString(arr));

		System.out.println("aslist(): "+Arrays.asList(arr));

		int arr2[][] = {{10,20},{40,80}};

		System.out.println("deepToString(): "+Arrays.deepToString(arr2));
	}

}
// program terminated....
