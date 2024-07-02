package logics;

import java.util.Scanner;

public class P19 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any 2 no: ");
		
		int a = obj.nextInt();
		int b = obj.nextInt();
		
		if(a>b)
			System.out.println(a+" is greater.");
		else if(b>a)
			System.out.println(b+" is greater.");
		else
			System.out.println(a+" and "+b+" are equal.");
			
		
		
		// TODO Auto-generated method stub

	}

}
