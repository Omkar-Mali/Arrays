package com.arrays;

import java.util.Scanner;

public class Ascending_Descending_sort {

	public static void main(String[] args) {
		
//		Taking user defined size of array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array size: ");
		int n = sc.nextInt();
		
		int [] a = new int [n];
		
//		Taking user defined array elements
		
		System.out.println("Enter " + n + " array elements: ");
		
		for(int i=0; i<a.length; i++) {
			
			a[i]=sc.nextInt();
		}
	
//		Printing user defined array
		System.out.println("User Defind array is: ");
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);

			}
		
		System.out.println();
		
//		Performing Ascending operation on array
		
		System.out.println("Sorting array in ascending order: ");
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
						
			}
			
		}
		
		System.out.println();
		
//		Printing sorted array in ascending order
		
		System.out.println("Sorted array in ascending order: ");
			
			for(int i=0; i<a.length; i++) {
		
		System.out.println(a[i]);

		}
			System.out.println();
			
			System.out.println("Ascending Sorting Completed");
			
			System.out.println();
			
			System.out.println("User need Sorting in Descending order");
			
			System.out.println();
			
			System.out.println("Soeted array in Descending order: ");
			
			
			for(int i=0; i<a.length; i++) {
				
				for(int j=i+1; j<a.length; j++) {
					
					if(a[i]<a[j]) {
						
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
							
				}
				
			}
			for(int i=0; i<a.length; i++) {
				
				System.out.println(a[i]);

				}
			
			System.out.println("Sorting completed");
			
	}

}
