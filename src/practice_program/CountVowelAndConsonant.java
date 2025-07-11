package practice_program;

import java.util.Scanner;

public class CountVowelAndConsonant {
	
	public static void main(String[] args) {
		int vowel=0,consonant=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		str=str.toLowerCase();
	    for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowel++;
			}
			else
			consonant++;
		}
		System.out.println("vowels= "+vowel+"    Consonant= "+consonant);
		
	}
}
