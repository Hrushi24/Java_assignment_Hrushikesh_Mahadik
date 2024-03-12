package java_assignment_till_array;
import java.util.Scanner;
public class Q12_natural_num_reverse {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Till which number you want to print natural numbers in reverse. ");
		int n;
		do {
			System.out.println("Select number between 1 to 2000 :");
			n = sc.nextInt();
		}while(n < 0 || n > 2000);
		
		System.out.println();
		
		System.out.println("Natural numbers in reverse order :");
		if(n > 0 && n < 2000) {
			for (int i = n;i > 0 ; i--) 
			{
				
				// added below to decorate output displayed in console.
				if(i%50 == 0) {
					System.out.println();
				}
				System.out.print(i +" ");
				
				
				
			}
		}
		
		sc.close();

	}

}
