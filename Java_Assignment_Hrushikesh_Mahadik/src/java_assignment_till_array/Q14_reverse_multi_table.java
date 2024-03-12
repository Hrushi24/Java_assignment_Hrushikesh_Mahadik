package java_assignment_till_array;

import java.util.Scanner;

public class Q14_reverse_multi_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Multiplication table in reverse generator");
		System.out.println("Enter number between 1 to 40: ");
		int number = sc.nextInt();
		
		System.out.println();
		
		for(int i = number; i >=  1 ;i--) 
		{
			for(int j = 10; j >=1;j--) 
			{
				System.out.print(i*j + " ");
				
			}
			System.out.println();
		}
		
		sc.close();

	}

}
