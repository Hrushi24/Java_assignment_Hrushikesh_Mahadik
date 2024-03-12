package java_assignment_till_array;
import java.util.Scanner;

public class Q20_sum_of_Even_till_nthNumber {

	public static void main(String[] args) {
		System.out.println("sum of all even numbers between 1 to nth Number.");
		
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Enter number greater than 1 : ");
			number = sc.nextInt();
		}while(number <= 0);
		
		
		int sum = 0;
		for(int i = 0;i <=number ;i++)
		{
			if(i % 2==0)
			{
				sum += i;
			}
		}
		
		System.out.println("Sum of even numbers between 1 to n'th number is " + sum+ " .");
		
		sc.close();
	}

}
