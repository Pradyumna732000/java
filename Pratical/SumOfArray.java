package corejava;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize array
		

		  int Sum=0;
		  int len;//length of array
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter Array length");
		  len=sc.nextInt();
		  
		  int a[]=new int[len];
		  System.out.println("Enter: "+len+" Elements To Store In Array\n");
		    for(int i=0;i<len;i++) {
		        a[i]=sc.nextInt();
		    }
		    
		    System.out.println("Sum of Elements of Array : \n");
		    
		    for(int i=0;i<len;i++) {
		    	
		    	Sum = Sum + a[i];
		        
		        
		    }
		    
		    System.out.print(Sum);
		  
		  
	

	

}
}
