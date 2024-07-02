package logics;

import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any 4 no: ");
		
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();	
		int d = obj.nextInt();
		if (a>b && a>c && a>d)
			System.out.println(a);
		else if(b>c && b>a && b>d)
			System.out.println(b);
		else if(c>a && c>b && c>d)
			System.out.println(c);
		else
			System.out.println(d);
	
		
		
		// TODO Auto-generated method stub

	}

}
