package java_assignment_till_array;
import java.util.Scanner;

public class Q2_vowels_or_not {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter charecher to chack vovel or consonet");
		System.out.println("Enter char");
		char alphabet = sc.next().toLowerCase().charAt(0);
		
		switch (alphabet) {
		
		case 'a':
		case 'e':	
		case 'o':
		case 'u':		
		case 'i':

			System.out.println("This is vowel");
			break;

		default:
			System.out.println("This is consonant");
			break;
		}
		sc.close();
		

	}

}
