package logics;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner obj  = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		
		int a = obj.nextInt();
		int b = obj.nextInt();
		
		float sum = a+b;
		float div = a/b;
		float mult =a*b;
		float diff = a-b;
		float rem = a%b;
		
		System.out.println(div+",mult="+mult+",remainder="+rem+",difference="+diff);

		// TODO Auto-generated method stub

	}

}
