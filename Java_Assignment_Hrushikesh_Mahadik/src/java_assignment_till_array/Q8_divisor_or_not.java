package java_assignment_till_array;
import java.util.Scanner;
public class Q8_divisor_or_not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 number to check 2nd divisible by 1st number.");
		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int num2 = sc.nextInt();
		
		if(num1%num2 == 0 || num2%num1==0) 
		{
			System.out.println("1st no.("+num1+") is multiple of 2nd no.("+num2+") .");
		}
		else 
		{
			System.out.println("1st no.("+num1+") is NOT a multiple of 2nd no.("+num2+") .");
		}

		sc.close();
	}

}
