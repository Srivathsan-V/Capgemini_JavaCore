package capgemini.day5;

public class Ignorecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "SRIVATHSAN";
		String S2 = "srivathsan";
		int j = S1.compareToIgnoreCase(S2);
		if(j==0) {
			System.out.println("The two strings are same");
		}
		else {
			System.out.println("The two strings are not same");
		}
		

}
}
