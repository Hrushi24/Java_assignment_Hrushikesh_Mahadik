package java_assignment_till_array;
import java.util.Scanner;

public class Q24_one_num_raised_to_other_value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Find value of one number raised to another number.");
		System.out.println("Enter first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number :");
		int num2 = sc.nextInt();
		
		System.out.printf("The value of '%d' raised to '%d' is %.0f .%n",num1,num2,Math.pow(num1, num2));
		
		sc.close();

	}

}
