package corejava;

import java.util.Scanner;


public class LogicalNotAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		
        
  
        // taking values from user
		
        System.out.println("Value of a = " );
        int a=sc.nextInt(15);
        
        System.out.println("Value of b = " );
        int b=sc.nextInt(16);
  
        // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));

	}



	}


