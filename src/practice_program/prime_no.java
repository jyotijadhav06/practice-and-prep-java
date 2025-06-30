package practice_program;
import java.util.Scanner;
public class prime_no {

	public static void main(String[] args) {
		int a,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		a=sc.nextInt();
		for(int i=2;i<=a/2;i++){
			
			if(a%i==0) {
				flag=1;
			}
		}
		if(flag==1)
			System.out.println("not prime no");
		else
			System.out.println(" prime no");
	}

}
