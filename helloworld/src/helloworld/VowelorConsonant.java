package helloworld;
import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.nextLine();
		if(word == "a" || word == "e" || word == "i" || word == "o" || word == "u") {
			System.out.println("Entered word is a vowel");
		}
		System.out.println("Entered word is a consonant");
	}

}
