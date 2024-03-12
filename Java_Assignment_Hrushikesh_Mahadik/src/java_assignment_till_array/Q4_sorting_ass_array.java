package java_assignment_till_array;
import java.util.Scanner;

public class Q4_sorting_ass_array {
	
	
	public static void sortAsending(int arr[]) {
		
		int n  = arr.length;
		
		for(int i = 0; i<n;i++) 
		{
			for(int j = 0; j < (n-1);j++) 
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("HOw many numbers you want to add?: ");
		int arrLen = sc.nextInt();
		int arr[] = new int[arrLen];
		
		for(int i = 0; i< arrLen ; i++) {
			System.out.println("Enter number No."+(i+1)+" :");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("This is original array :");
		for(int i = 0; i< arrLen ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sortAsending(arr);
		System.out.println();
		System.out.println("This is sorted array in assending order :");
		for(int i = 0; i< arrLen ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
		
		
	}

}
