package practice_program;

import java.util.Scanner;

public class factorial_no {

	public static void main(String[] args) {
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++) {
			f=f*i;		
		}
		System.out.println(f);
	}
}
