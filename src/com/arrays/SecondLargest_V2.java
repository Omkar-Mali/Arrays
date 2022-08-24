package com.arrays;

public class SecondLargest_V2 {

	public static void main(String[] args) {
		
		int[] a = {6,8,2,4,3,1,5,7,9,15,20};
		
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i] > largest) {
				
				second_largest = largest;
				largest = a[i];
			}
			else if(a[i]>second_largest && a[i]!=largest) {
				
				second_largest = a[i];
			}
			 
		}
		System.out.println("Second largest element is :" + second_largest);
		System.out.println("largest element is :" + largest);
		
	}
}
