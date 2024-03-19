package java_assignment_till_array;
import java.util.*;

public class Q22_Program_to_give_ASCII_value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter char to find its ASCII value.");
		System.out.println("Enter Single character : ");
		char alpha = sc.next().charAt(0);
		System.out.println("ASCII value of '"+ alpha +"' is : "+ ((int) alpha ));
		
		sc.close();

	}

}
