package java_assignment_till_array;
import java.util.Scanner;

public class Q13_Multiplication_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Multiplication table generator");
		System.out.println("Enter number between 1 to 40: ");
		int number = sc.nextInt();
		
		System.out.println();
		
		for(int i = 1; i <=  number ;i++) 
		{
			for(int j = 1; j <=10;j++) 
			{
				System.out.print(i*j + " ");
				
			}
			System.out.println();
		}
		
		sc.close();
	}

}
