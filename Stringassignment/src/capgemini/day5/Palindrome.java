package capgemini.day5;

//Write a program to check the strings are palindrome or not
public class Palindrome {

	public static void main(String[] args) {
		String S1 = "MADAM";
		String revS1 = "";
	    
	    int S1Length = S1.length();

	    for (int i = (S1Length - 1); i >=0; --i) {
	      revS1 = revS1 + S1.charAt(i);
	    }

	    if (S1.toLowerCase().equals(revS1.toLowerCase())) {
	      System.out.println(S1 + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(S1 + " is not a Palindrome String.");
	    }
	}

}
