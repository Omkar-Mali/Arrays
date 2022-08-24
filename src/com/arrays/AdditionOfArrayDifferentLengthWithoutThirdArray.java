package com.arrays;

public class AdditionOfArrayDifferentLengthWithoutThirdArray {
	
	public static void main(String[] args) {

		int [] a = {10,20,30};
		int[] b = {10,20,30,40,50};
		
		int length;
		
		if(a.length > b.length){
			
			for(int i=0; i<a.length; i++){
			//it will add the elements of array b till its size gets completed
				
				if(b.length>i){
					
					a[i] = a[i] + b[i];
				}
			
				if(b.length<=i){
					
					a[i] = a[i];
				}
			}
			
			for(int m:a){
				
				System.out.println(m);
			}
			
		} else {
			
			for(int i=0; i<b.length; i++){
				
			//it will add the elements of array a till its size gets completed
				if(a.length>i){
					
					b[i] = b[i] + a[i];
				}
			
				if(a.length<=i){
					
					b[i] = b[i];
				}
			}
			
			for(int m:b){
				
				System.out.println(m);
			}
		}
		
	}

}
