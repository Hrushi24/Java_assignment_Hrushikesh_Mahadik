package java_assignment_till_array;
import java.util.Scanner;

public class Q26_sum_of_digits {
	
	static void withString(int num) {
		String numS ="";
		int sum = 0; 
		numS += num;
		for(int i =0; i < numS.length();i++) {
			sum += ( numS.charAt(i)- '0');
			
		}
		System.out.printf("Sum of digit (String method)'%s' is %d .%n",numS,sum);
	}
	
	static void withModulo(int num) 
	{
		int sum = 0;
		int n1 =num;
		while (n1<0 || n1 > 0 ) 
		{
			sum += (n1 %10)*1;
			n1 = n1 / 10;
		}
		System.out.printf("Sum of digits (Modulo method) for %d is : %d . %n" ,num , sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to make sum of digits.");
		System.out.println("Enter any natural digit:");
		int num = sc.nextInt();
		
		withModulo(num);
		withString(num);
		
		
		sc.close();

	}

}
