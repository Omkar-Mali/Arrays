package com.arrays;

import java.util.Scanner;

public class SecondLargest_V1 {

	public static void main(String[] args) {
		
//		Algorithm: First sort array in Descending order and get element at first index a[1].
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size here: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<a.length; i++) {
			
			a[i] = sc.nextInt();
			
		}
					
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]<a[j]) {
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
			if(i==1) {				//To save time sorted only till first element
				System.out.println("I am in if loop");
				break;
			}
		}
		
		System.out.println("Sorted array is: ");
		
		for(int i=0; i<a.length; i++) {
			
			
			System.out.println(a[i]);
		}
		
		System.out.println("Second largest element in an array is: " +a[1]);
		
		
		
		
	}
}
