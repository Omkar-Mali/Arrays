package com.arrays;

public class Traversal_2DArray_V1 {
	
	public static void main(String[] args) {
		
	//For 2 D Array
		
		int[][] a = {{10,20},{30,40,50}};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				
				System.out.print(a[i][j]);
				
			}
			System.out.println();
		}
		
	}

}
