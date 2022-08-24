package com.arrays;

public class AdditionOfElements {
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50,60};
	
		int sum = 0;

		for(int i=0; i<a.length; i++) {
		
			sum = sum + a[i];
		}
		
		System.out.println("Sum of all elements in array is: "+sum);
	}
}
