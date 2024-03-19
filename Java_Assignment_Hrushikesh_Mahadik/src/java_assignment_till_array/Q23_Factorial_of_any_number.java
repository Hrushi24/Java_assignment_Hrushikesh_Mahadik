package java_assignment_till_array;
import java.util.*;

public class Q23_Factorial_of_any_number {
	
	public static int factorial(int num) 
	{
		
		if(num == 1) {
			return num * num;
			
		}
		else {
			return num * factorial(num - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Find factorial of any number.");
		System.out.println("Enter number (recommend between 1 to 20) :");
		int num = sc.nextInt();
		while(num < 1) 
		{
			System.out.println("Number should be gretter then Zero.");
			System.out.println("Enter number again : ");
			num = sc.nextInt();
		}
		
		System.out.println("Factorial of number '"+num+"' is :"+factorial(num)+". ");
		
		sc.close();

	}

}
