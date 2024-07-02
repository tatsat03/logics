package logics;
import java.util.Scanner;
//sum of 4 digits

public class P10 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any no: ");
		
		int a = obj.nextInt();
		int d,num=0;
		
		while(a>0) {
			num = num*10+a%10;
			a=a/10;
			
			
		}
		System.out.println(num);
		
		// TODO Auto-generated method stub

	}

}
