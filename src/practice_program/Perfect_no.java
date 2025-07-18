package practice_program;

import java.util.Scanner;

public class Perfect_no {
	
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		for(int i=1;i<no;i++) {
			
			if(no%i==0) {
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("\nSum = "+sum);
		if(no==sum)
			System.out.println("perfect number");
		else
			System.out.println("not a perfect number");
	}

}
