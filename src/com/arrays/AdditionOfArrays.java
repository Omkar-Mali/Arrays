package com.arrays;

class AdditionOfArrays{

	public static void main(String[] args){
	
		int[] a = {10,20,30,40,50,60};
		int[] b = {10,20,30,40,50,60};
		int[] c = new int[a.length];		

		for(int i =0; i<a.length; i++){
			
			c[i] = a[i] + b[i];
										
		}

		for(int i=0; i<c.length; i++){

			System.out.println(c[i]);
		}
	}
}