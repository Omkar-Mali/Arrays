package com.arrays;

public class AdditionWithoutThirdArray {
	
		public static void main(String[] args) {
		

			int[] a = {40,20,60,40,50,60};
			int[] b = {10,20,30,40,50,60};		

			for(int i =0; i<a.length; i++){
		
				a[i] = a[i] + b[i];
									
			}

			for(int i=0; i<a.length; i++){

				System.out.println(a[i]);
			}
	}
}
