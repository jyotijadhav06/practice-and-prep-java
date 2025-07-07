package practice_program;
import java.util.Scanner;
public class Armstrong_no{
	int no,sum=0;
	public void isArmstrong(int x) {
		int orig=x;
		while(x>0) {
			no=x%10;
			sum+=no*no*no;
			x=x/10;
		}
		if(orig==sum) {
			System.out.println("Armstrong no");
		}
		else {
			System.out.println("not armstrong no");
		}
	}
	
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x=sc.nextInt();
		Armstrong_no a=new Armstrong_no();		
		a.isArmstrong(x);
	}
}
