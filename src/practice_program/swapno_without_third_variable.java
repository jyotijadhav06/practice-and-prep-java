package practice_program;

import java.util.Scanner;

public class swapno_without_third_variable {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no: ");
		int a=sc.nextInt();
		System.out.println("Enter Second no: ");
		int b=sc.nextInt();
		System.out.println("Before Swapping:  a="+a+"  b="+b);
		
		//Swapping code
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping: a="+a+"  b="+b);
	}

}
