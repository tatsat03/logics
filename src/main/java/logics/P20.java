package logics;

import java.util.Scanner;

public class P20 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("How many numbers: ");
		int arr_size = 0;
		
		//why is if statement is used?
		if (obj.hasNextInt()) {
			arr_size = obj.nextInt();
		}
		
		int[] arr =new int[arr_size];
		
		System.out.println("Enter numbers: ");
		for (int i =0; i< arr_size; i++) {
			if(obj.hasNextInt()) {
				arr[i]= obj.nextInt();
			}
		}
		
		int max = arr[0];
		
		for (int i =0; i< arr_size-1; i++ ) {
			if (arr[i] > max)
				max= arr[i];
		}
		System.out.println("Largest no is: "+max);
		
		

		// TODO Auto-generated method stub

	}

}
