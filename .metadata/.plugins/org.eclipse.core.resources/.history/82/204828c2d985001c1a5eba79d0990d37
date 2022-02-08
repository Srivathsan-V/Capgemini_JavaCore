package capgemini.day5;

import java.util.Scanner;
//Write a program to remove characters from a string

public class Removecharactersfromstring {

	public static void main(String[] args) {
		// variable names should start with lowercase letters

		char s2;
		Scanner sc = new Scanner(System.in);
		//char[] ch = new char[10];
		// ch = s1.chars();
		System.out.println("Enter the string:");
		StringBuffer s3 = new StringBuffer(sc.next());
		System.out.println("Enter the character to be removed:");
		s2 = sc.next().charAt(0);

		// String s5;
		// String s4 = new String("STRING");
		sc.close();
		// StringBuilder has deletecharAt method
		for (int i = 0; i < s3.length(); i++) {
			if (s3.charAt(i) == s2) {
				s3.deleteCharAt(i);
			}
		}
		System.out.println("After removing the words: " + s3);
	}

}
