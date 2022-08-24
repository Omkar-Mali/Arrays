package com.arrays;

import java.util.Scanner;

public class BubbleSorting_Descending {
	
	public static void main(String[] args) {
		
		
//		int[] a = {60,80,40,20,50,90,10};
		
//		OR
				
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
		}
		System.out.println("Sorted array is: ");
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		
	}

}
