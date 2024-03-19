package java_assignment_till_array;
import java.util.*;




public class Q21_sum_of_odd_1_to_n {
	
	public static int sumOfOdd(int num) 
	{
		int sum = 0;
		for(int i = 1;i<=num; i++) {
			if (i%2==1) 
			{
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Sum of all odd numbers between 1 to nth number :");
		System.out.println("Enter n'th number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(sumOfOdd(num));
		
		
		sc.close();
	}

}
