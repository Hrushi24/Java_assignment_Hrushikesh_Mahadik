package java_assignment_till_array;
import java.util.Scanner;

public class Q3_sum_of_elements_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("HOw many numbers you want to add?: ");
		int arrLen = sc.nextInt();
		int arr[] = new int[arrLen];
		
		for(int i = 0; i< arrLen ; i++) {
			System.out.println("Enter number No."+(i+1)+" :");
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for(int i = 0; i< arrLen ; i++) {
			temp += arr[i];
		}
		System.out.println("Sum of elements in given array is : " + temp +" .");
		sc.close();
	}

}
