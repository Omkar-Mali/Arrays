package com.arrays;

import java.util.Scanner;

public class DeletionElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int[] b = new int[n];
		int[] c = new int[n-1];
		
		System.out.println("Enter array elements here: ");
		for(int i=0; i<b.length; i++) {
			
			b[i] = sc.nextInt();	
		}
	
		
		System.out.println("Enter the index position to delete element: ");
		int q = sc.nextInt();
		
		for(int i=0; i<c.length; i++) {			//b = 10 20 80 30 40 50
			
			if(i<q) {							//c = 10 20				
				
				c[i] = b[i];
			}
			else {
				c[i] = b[i+1];
			}
			
		}
		
		for(int i=0; i<c.length; i++) {
			
			System.out.println(c[i]);
		}
	}
}
