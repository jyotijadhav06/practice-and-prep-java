package practice_program;

import java.util.Scanner;

public class Leaf_year_or_not {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year: ");
		int year=sc.nextInt();
		if(year%4==0 && year%100!=0||year%400==0) //check leaf year or not
			System.out.println("This year is leaf year");
		else
			System.out.println("This is not leaf year");
	}

}
