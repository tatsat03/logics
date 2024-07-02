package logics;
import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any no: ");
		
		int a = obj.nextInt();
		int d,sum=0;
		
		while(a>0) {
			d=a%10;
			sum= sum+d;
			
			a=a/10;
			
		}
		System.out.println(sum);
		
		
		
		// TODO Auto-generated method stub

	}

}
