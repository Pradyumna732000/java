package corejava;
import java.util.Scanner;

public class LogicalOrAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of sccaner class
		Scanner sc= new Scanner(System.in);
		
		// Initializing variables
		int result;
		
		//taking value from user
		System.out.println("value of a :");
		int a=sc.nextInt(10);
		System.out.println("value of b :");
		int b=sc.nextInt(16);
		System.out.println("value of c :");
		int c=sc.nextInt(18);
		System.out.println("value of d :");
		int d=sc.nextInt(12);
		
		//using logical OR operator to verify two constraints
		if((a<b || c==d)) {
			System.out.println("One or both" + " the conditions are true");
		}
        else
            System.out.println("Both the" + " conditions are false");
}



	}


