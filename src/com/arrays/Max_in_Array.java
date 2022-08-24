package com.arrays;

import java.util.Scanner;

public class Max_in_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size here: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter array elements here: ");
		
		for(int i=0; i<a.length; i++) {
			
			a[i] = sc.nextInt();
			
		}
		// 10 20 30 40 50 
		int max = a[0];   //10
		
		System.out.println("Maximum element in array is: ");
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i] > max) {
				
				max = a[i];     //
				
			}
			
		}
		System.out.println("Max element is: "+ max);

	}

}
