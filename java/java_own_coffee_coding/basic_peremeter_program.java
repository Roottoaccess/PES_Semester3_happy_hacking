import java.util.Scanner;
public class basic_peremeter_program {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int height, width;
        System.out.print("Enter the height of the square: "); // Taking the input of the height
        height = sc.nextInt();
        System.out.print("Enter the width of the square: "); // Taking the input of the width
        width = sc.nextInt();
        peremeter(height,width); // function calling
    }
    static void peremeter(int height,int width){
        String name = "Biswarup Dutta";
        float formula = 2 * (height + width); // algorithm
        System.out.println("Welcome "+name+", the peremeter of the square is: "+formula);
    }
}