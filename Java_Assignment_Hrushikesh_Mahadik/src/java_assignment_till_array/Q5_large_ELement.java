package java_assignment_till_array;
import java.util.Scanner;

public class Q5_large_ELement {
	
	public static int largestElement(int arr[]) 
	{
		int largest = 0;
		
		int arrLen = arr.length;
		
		for(int i = 0; i < arrLen;i++) {
		
			if(largest < arr[i]) {
				largest = arr[i];			}
			
			
		}
		
		
		return largest;
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
		
		int bigNumber = largestElement(arr);
		
		System.out.println("In this given array.");
		for(int i = 0; i< arrLen ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Biggest number in given array is :" + bigNumber + " .");
		sc.close();
		}

}
