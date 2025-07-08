package practice_program;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		
		int f1=0,f2=1,f3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter terms you have to print: ");
		int no=sc.nextInt();
		System.out.print(f1+" "+f2);
		for(int i=1;i<no;i++) {
		f3=f1+f2;
		System.out.print(" "+f3+" ");
		f1=f2;
		f2=f3;
		
	}
}

}
