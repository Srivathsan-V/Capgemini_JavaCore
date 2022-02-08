package capgemini.day5;

public class Swaptwostringswithouttemp {
	public static void main(String[] args) {
		String S1 = "My";
		String S2 = "Name";
		System.out.println(S2.length());
		System.out.println("Before Swapping S1: "+S1);
		System.out.println("Before Swapping S2: "+S2);
		
		S1 = S1+S2;
		System.out.println(S1);
		S2 = S1.substring(0, S1.length() - S2.length());
		S1 = S1.substring(S2.length());
		System.out.println("After Swapping S1: "+S1);
		System.out.println("After Swapping S2: "+S2);
	}

}
