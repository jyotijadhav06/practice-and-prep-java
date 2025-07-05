package practice_program;
import java.util.Scanner;
public class swap_no {

	public static void main(String[] args) {
		
		byte a,b, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no: ");
		a=sc.nextByte();
		System.out.println("Enter second no: ");
		b=sc.nextByte();
		System.out.println("Before swapping: a="+a+ " b="+b);
		//swapping of two variable
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping: a="+a+"  b= "+b);
		
	}

}
