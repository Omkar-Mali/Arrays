package com.arrays;

public class MissingNumber {
	
	public static void main(String[] args) {
	
		int[]a = {1,2,3,5};  // 4 is missing here
	
		int sum=0;
		int sum1=0;
			for(int i=0; i<a.length; i++) {
		
				sum = sum + a[i];
			}
			
			for(int i=1; i<=5; i++) {
				
				sum1 = sum1 + i;
			}
			
	System.out.println("Missing number in array is: "+ (sum1-sum));
	}
}
