package practice_program;

import java.util.Scanner;

public class palindrome_no {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int no=sc.nextInt();
		int num1=no;
		while(no>0) {
			int num=no%10;
		    sum=sum*10+num;
		     no=no/10;
			}
		if(num1==sum)
			System.out.println("Palindrome no");
		else
			System.out.println("not Palindrome no");
	}		

}
