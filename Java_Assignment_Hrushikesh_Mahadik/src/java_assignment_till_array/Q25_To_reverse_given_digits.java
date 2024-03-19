package java_assignment_till_array;
import java.util.Scanner;

public class Q25_To_reverse_given_digits {
	
	static void reverse(int num) {
		String reverse ="";
		int n1 = num;
		
		if(n1 > 0) 
		{
			while(n1 > 0) 
			{
				//for positive numbers
				reverse += n1%10;
				n1 = n1/10;
			}
			System.out.println("Reverse number is : " + reverse+" .");
		}
		else {
			//For negative numbers.
			while(n1 < 0) 
			{
				reverse += (n1%10)*-1;
				n1 = n1/10;
			}
			System.out.println("Reverse number is : -" + reverse +" .");
		}
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program to reverse given number .");
		System.out.println("Enter any natural digit : ");
		int num  = sc.nextInt();
		
		reverse(num);
		
		
		
		
		sc.close();
		

	}

}
