package logics;

import java.util.Scanner;

public class P22 {

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
		
		int mid = arr_size/2; 
		System.out.println(arr[mid]);
		
		// TODO Auto-generated method stub

	}

}
