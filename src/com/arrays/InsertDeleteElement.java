package com.arrays;
import java.util.Scanner;

public class InsertDeleteElement {

	public static void main(String[] args) {
		
//		Insertion of a element in array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = sc.nextInt();
		
		int[]a = new int[n];
		
		int[]b = new int[n+1];
		
		System.out.println("Enter array elements here: ");
		for(int i=0; i<a.length; i++) {
			
			a[i] = sc.nextInt();	
		}
		
		System.out.println("Enter index at which element to be added: ");
		int m = sc.nextInt();
		
		System.out.println("Enter element to be insert at "+ m +" index position: ");
		int p = sc.nextInt();
		
		for(int i=0; i<b.length; i++) {
			
			if(i<m) {
				
				b[i] = a[i];
			}
			else if(i==m) {
				
				b[i] = p;
			}
			else {
				
				b[i] = a[i-1];
				
			}
		}
		
		for(int i=0; i<b.length; i++) {
			
			System.out.println(b[i]);
		}
		
		
		//DELETION OF ARRAY ELEMENT
		
		
		int[] c = new int[n];
		
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
