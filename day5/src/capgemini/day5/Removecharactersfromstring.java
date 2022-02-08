package capgemini.day5;

public class Removecharactersfromstring {

	public static void main(String[] args) {
		StringBuilder S1 =new StringBuilder("Java Programming");
		char S2 = 'a';
		
		for(int i =0;i<S1.length();i++) {
			if(S1.charAt(i) == S2) {
				S1.deleteCharAt(i);
			}
		}
		System.out.println("After removing the words: " +S1);
	}

}
