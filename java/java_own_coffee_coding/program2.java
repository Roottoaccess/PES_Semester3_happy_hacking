// Take two numbers as input and print their sum, difference, product, and quotient.

import java.util.Scanner;

public class program2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: "); // This is the first number as the input....
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: "); // This is the second number as the input....
        int num2 = sc.nextInt();

        // Doing the sum..
        int sum = num1 + num2;
        System.out.println("The sum of two numbers: "+sum);
        // Doing the difference..
        int diff = num1 - num2;
        System.out.println("The difference of two numbers: "+diff);
        // Doing the mul..
        int mul = num1 * num2;
        System.out.println("The multiplication of two numbers: "+mul);
        // Doing the divide..
        int div = num1 / num2;
        System.out.println("The divide of two numbers: "+div);
    }
}
