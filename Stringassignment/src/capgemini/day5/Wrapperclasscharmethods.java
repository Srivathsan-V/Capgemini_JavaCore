package capgemini.day5;

public class Wrapperclasscharmethods {

	public static void main(String[] args) {
	char c = 'D';
	char b = 'X';
	// compare method is used to compare two char values numerically.
	// returns 0 if its equal, return value less than 0 if char 1 is less than char 2 otherwise returns value > 0 
	System.out.println("Comparison value is: "+Character.compare(c, b));
	
	// returns the hash code value for the character
	System.out.println("Hash code value b is: "+Character.hashCode(b));
	System.out.println("Hash code value c is: "+Character.hashCode(c));
	}

}
