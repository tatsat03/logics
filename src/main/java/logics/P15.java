package logics;

import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no: ");
		
		int a = obj.nextInt();
		
		if(a%2==0)
			System.out.println(a+" is Even.");
		else
			System.out.println(a+" is odd.");
		// TODO Auto-generated method stub

	}

}
