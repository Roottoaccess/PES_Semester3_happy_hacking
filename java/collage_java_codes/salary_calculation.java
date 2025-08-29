import java.util.Scanner;


class salary{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		System.out.print("Enter your Basic Salary: ");
		int salary = sc.nextInt();

		System.out.print("Enter the allowences: ");
		int allowences = sc.nextInt();

		int deduction = 2000;
			int gross_salary = salary + allowences;
		System.out.println("gross salary: "+gross_salary);

			int netsalary = gross_salary - deduction;
		System.out.println("net salary: "+netsalary);
	}
}
// program terminated.....
