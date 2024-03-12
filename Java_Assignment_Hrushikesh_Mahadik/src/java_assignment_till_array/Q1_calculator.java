package java_assignment_till_array;
import java.util.Scanner;
public class Q1_calculator {
	
	static void calsi(double num1, double num2,String opt ) 
	{
		double result = 0;
		
		if (opt.equals("+")) {
			result = num1 + num2;
		}
		else if (opt.equals("-")) {
			result = num1 - num2;
		}
		else if (opt.equals("*")) {
			result = num1 * num2;
		}
		else if (opt.equals("/")) {
			try {
			result = num1 / num2;
			}
			catch(Exception e) 
			{
				System.out.println("Can not divide number by Zero");
			}
		}
		else {
			System.out.println("Enter valid operator.");
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Basic calculator.");
		
		System.out.println("Enter 1st number :");
		double num1 = sc.nextDouble();
		System.out.println("Enter 2nd number :");
		double num2= sc.nextDouble();
		System.out.println("Enter operator (+,-,*,/) :");
		String oper = sc.next();
		
		
		calsi(num1,num2,oper);
		
		sc.close();
	}

}
