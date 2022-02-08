package capgemini.day5;

public class MyString {

	public static void main(String[] args) {
		String S1 = "My name is S1";
		String S2 = new String("My name is S2");
		String S3 = "Software";
		String S4 = new String("Software");
		
		//to find the length of the string use length method
		System.out.println(S2.length());
		
		// isEmpty method is used to check whether the string holds same value or not
		if(S2.isEmpty()) {
			System.out.println("S2 is empty");
		}
		else {
			System.out.println("S2 is not empty");
		}
		//charAt will return character at a specified location
		System.out.println(S1.charAt(1));
		
		//codePointAt -- it returns the unicode value of the character at the specified index
		System.out.println(S2.codePointAt(3));
		
		
		//Equals -- it is used to compare two strings
		if(S3.equals(S4)) {
			System.out.println("String is equal");
		}
		else {
			System.out.println("String is not equal");
		}
		
		//equalsignorecase -- it compares two string irrespective of their cases
		if(S3.equalsIgnoreCase(S4)) {
			System.out.println("True");
		}
		else {
			
			System.out.println("False");
		}
		
		// compareto -- it is used to compare two strings and the comparison is based on the uniode value of the string
		String S5 = "e";
		String S6 = "E";
		System.out.println(S5.compareTo(S6));
		
		//comparetoignorecase
		System.out.println(S5.compareToIgnoreCase(S6));
		
		 //startsWith -- it is used to check string is start with particular value
	     System.out.println(S2.startsWith("J"));
	     
	     System.out.println(S1.substring(3));
	     System.out.println(S1.substring(3,7));
	     

	      System.out.println(S1.concat(" "+ "HELLO"));
	      
	      //contains -- it checks for whether the specified string is present in the given string or not and returns true or false
	      System.out.println(S1.contains("Pro"));
	      System.out.println(S2.contains("Java"));
	      
	      //toLowerCase -- it is used to change the case to lowercase
	      System.out.println(S1.toLowerCase());
	      
	    //toUpperCase -- it is used to change the string case to uppercase
	      System.out.println(S2.toUpperCase());
	      
	      //trim-- it is used to remove the space
	      System.out.println(S1.trim());
	      
	      
	      String S7="Programming";
	      String S8="Programming";
	      String S9=new String("Programming");
	      System.out.println(S7.hashCode());
	      System.out.println(S8.hashCode());
	      
	      if(S7==S9)
	      {
	    	  System.out.println("Equal");
	      }
	      else
	      {
	    	  System.out.println("Not equal");
	      }


	}

}
