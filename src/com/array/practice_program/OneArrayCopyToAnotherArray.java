package com.array.practice_program;

public class OneArrayCopyToAnotherArray {
		
		public static void main(String[] args) {
			
			int a[]= {10,20,39};
			int b[]=new int[a.length];
			b=a;
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+" ");
			}
		}

}
