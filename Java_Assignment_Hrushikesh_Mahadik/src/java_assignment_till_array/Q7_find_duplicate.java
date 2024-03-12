package java_assignment_till_array;
import java.util.Scanner;

public class Q7_find_duplicate {
    
    static void findDuplicates(int arr[]) {
        boolean foundDuplicate = false;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    foundDuplicate = true;
                    System.out.print(arr[i] +" ");
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to add?: ");
        int arrLen = sc.nextInt();
        int arr[] = new int[arrLen];

        for(int i = 0; i < arrLen; i++) {
            System.out.println("Enter number No." + (i+1) + " :");
            arr[i] = sc.nextInt();
        }

        System.out.println("The original array :");
        
        for(int i=0; i < arrLen;i++) 
        {
        	System.out.print(arr[i] +" ");
        }
        System.out.println();
        System.out.print("Duplicate elements in array are : " );
        findDuplicates(arr);

        sc.close();
    }
}
