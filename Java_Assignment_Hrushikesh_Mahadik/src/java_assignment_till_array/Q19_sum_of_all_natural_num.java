package java_assignment_till_array;

import java.util.Scanner;

public class Q19_sum_of_all_natural_num {
	
	static double sumOfNum(int num) {
		double first = (num/2.0);
		double second = num +1;
		return (first * second);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Sum of all given natural numbers.");
		System.out.print("Enter n'th number ,");
		int number;
		do {
			System.out.println("Number must be grater than 1: ");
			number = sc.nextInt();
		}
		while(number <= 0);
		
		System.out.println();
		int sum = 0;
		for(int i = 0;i <= number ; i++)
		{
			sum += i;
		}
		
		double byFormula = sumOfNum(number);
		System.out.println("Sum of natural number using formula :" + byFormula);
		
		System.out.println();
		System.out.println("Sum of all natural numbers till " + number +" is "+sum +" .");
		
		sc.close();

	}

}
