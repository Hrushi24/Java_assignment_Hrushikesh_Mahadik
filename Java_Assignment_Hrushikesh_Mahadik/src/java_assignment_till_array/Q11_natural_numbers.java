package java_assignment_till_array;
import java.util.Scanner;

public class Q11_natural_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Till which number you want to print natural numbers: ");
		int n = sc.nextInt();
		System.out.println();
		
		
		if(n > 0) {
			for (int i = 1;i <= n ; i++) 
			{
				System.out.print(i +" ");
				
				// added below to decorate output displayed in console.
				if(i%50 == 0) {
					System.out.println();
				}
				
			}
		}
		
		sc.close();
	}

}
