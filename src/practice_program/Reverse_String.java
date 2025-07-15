package practice_program;

import java.util.Scanner;

public class Reverse_String {
	
	public static void main(String[] args) {
		String rev_str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
	    String str=sc.next();
	    for(int i=str.length()-1;i>=0;i--) {
	    	
	    rev_str += str.charAt(i);
	    
	    }
	    System.out.println("Reverse String is:"+rev_str);
	    
		
	}
	
}
