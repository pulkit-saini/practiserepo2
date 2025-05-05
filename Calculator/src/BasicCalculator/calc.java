package BasicCalculator;
import java.util.*;

public class calc {

	
	
	public static int sum(int x, int y) {
		return x + y ;
	}
	public static int multiply(int x, int y) {
		return x*y ;
	}
	public static int subtract(int x, int y ) {
		return x-y;
	}
	public static float divide(int x, int y) {
		return (float)(x/y); 
	}
	public static int modulo(int x, int y) {
		return x%y ;
	}
	
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("BASIC CALCULATOR \n \n");
		
		System.out.println("Enter Number1 : ");
		int num1  = sc.nextInt();
		System.out.println("Enter Number2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("Press Number to Perform Operations between Number 1 and Number 2");
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Divide");
		System.out.println("Bonus* :)");
		System.out.println("Press 5 for Modulo");
		
		int userNum = sc.nextInt();
		
		switch(userNum) {
		case 1 : 
			System.out.println(sum(num1, num2));
			break;
		case 2 : 
			System.out.println(subtract(num1, num2));
			break;
		case 3 : 
			System.out.println(multiply(num1, num2));
			break;
		case 4 : 
			System.out.println(divide(num1, num2));
			break;
		case 5 : 
			System.out.println(modulo(num1, num2));
			break;
		default: 
			System.out.print("Enter Number Carefully");
			
		}
		
		
		
		
		
		
		
	}
	


}
