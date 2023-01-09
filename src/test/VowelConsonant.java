package test;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the letter");
		String ch  = sc.nextLine();
		
		
		
		if(ch =="a" || ch == "e" || ch == "i" || ch == "o" || ch == "u")
		{
			System.out.println("This is a vowel");
		}
		else
		{
			System.out.println("This is a consononant");
		}
		
	}

}
