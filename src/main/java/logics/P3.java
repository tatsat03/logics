package logics;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner obj  = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		
		int a = obj.nextInt();
		int b = obj.nextInt();
		
		int sum = a+b;
		int div = a/b;
		int mult =a*b;
		int diff = a-b;
		int rem = a%b;
		
		System.out.println(div+",mult="+mult+",remainder="+rem+",difference="+diff);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
