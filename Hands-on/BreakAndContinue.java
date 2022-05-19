package corejava;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int s = sc.nextInt();
		
		for (i=0;i<=20;i++) {
			if(i==7) {
				continue;
				
			}
			System.out.println(i);
			if(i==15) {
				break;
			}
		}

	}

}
