package capgemini.day5;
//Write a program to count no of words in a string

public class Countnoofwords {

	public static void main(String[] args) {
		String S1 = "Java Programming";
		int count = 0;
		char S2 = ' ';
		for(int i=0;i<S1.length();i++) {
			S2 = S1.charAt(i);
			if(S2!=' ') {
				count++;
			}
			
		}
		System.out.println("No of Words in a String: "+count);
	}

}
