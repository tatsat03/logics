package logics;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any 3 no: ");
		
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();		
		if (a>b && a>c)
			System.out.println(a);
		else if(b>c && b>a)
			System.out.println(b);
		else
			System.out.println(c);
			
		// TODO Auto-generated method stub

	}

}
