package com.array.practice_program;

public class LargestElementinAnArray {
		
		public static void main(String[] args) {
			int a[]= {10,20,30,40};
			int minVal=a[0];
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
				if(a[i]>minVal) {
					minVal=a[i];
				}
			}
			System.out.println("\nLargest element in an array: "+minVal);
		}
}
