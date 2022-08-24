package com.arrays;

import java.util.Scanner;

public class Min_in_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size here: ");
		int n = sc.nextInt();
		
		int a [] = new int[n];
		
		System.out.println("Enter array elements here: ");
		
		for(int i=0; i<a.length; i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		int min = a[0];   
		
		System.out.println("Mimimum element in array is: ");
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i] < min) {
				
				min = a[i];     
				
			}
			
		}
		System.out.println("Min element is: "+ min);

		

	}

}
