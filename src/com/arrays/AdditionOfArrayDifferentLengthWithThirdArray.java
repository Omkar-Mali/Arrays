package com.arrays;

public class AdditionOfArrayDifferentLengthWithThirdArray {
	
	public static void main(String[] args) {
		
		//array sizes are different
			int[] a = {10,20,30};
			int[] b = {10,20,30,40,50};
			
			int length;
			
			if(a.length>b.length){
				
				length = a.length;
				
			} else {
				
				length = b.length;
			}
			
			int c[] = new int[length];
			
			for(int i=0; i<c.length; i++){
				
				//it will add the elements of array a till its size gets completed
				if(a.length>i){
					
					c[i] = c[i] + a[i];
					
				}
				//it will add the elements of array b till its size gets completed
				if(b.length>i){
					
					c[i] = c[i] + b[i];
				}
			}
			
//			System.out.println(c[i]);

			for(int m:c){
				System.out.println(m);
			}
	}

}
