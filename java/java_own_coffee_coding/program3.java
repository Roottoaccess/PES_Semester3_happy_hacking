import java.util.Scanner;
public class program3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("First number: ");
        num1 = sc.nextInt();
        System.out.print("Second number: ");
        num2 = sc.nextInt();
        third_number(num1, num2);
    }
    static void third_number(int num1,int num2){
        int num3;
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("first number: "+num1+" second number: "+num2);
    }
}
