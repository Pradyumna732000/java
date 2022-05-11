package corejava;
import java.util.Scanner;

public class Whileloop {

		public static void main(String[] arg) {
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Your Value :");
			int num=sc.nextInt();
			System.out.println("Table of "+num);
			int i=1,tab;
			while(i<=10) {
				tab=num*i;
				
				System.out.println(tab);
				i++;
				
			
			}
		}


	}
