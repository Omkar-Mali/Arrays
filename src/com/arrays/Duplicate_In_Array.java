package com.arrays;


//Program to print duplicate elements in an array

public class Duplicate_In_Array {
	
	public static void main(String[] args) {
		
		
		int[] a = {10,20,50,20,10};
		
		boolean flag = false;
		
		System.out.println("Duplicate elements are: ");
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
			
				
				if(a[i] == a[j]) {
						
						System.out.println(a[i]);
		
				}
			}		
		}
	}
}
