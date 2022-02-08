package capgemini.day5;

import java.util.Arrays;

class AreAnagram{
	static int no_of_chars = 256;
	static boolean areanagram(char C1[],char C2[]) {
		
		int[] count1 = new int[no_of_chars];
		Arrays.fill(count1, 0);
		int[] count2 = new int[no_of_chars]; 
		Arrays.fill(count2, 0);
		int i;
		
		for (i = 0; i < C1.length && i < C1.length;
	             i++) {
	            count1[C1[i]]++;
	            count2[C2[i]]++;
	        }
	 
	        if (C1.length != C2.length) {
	            return false;
		
	}
	for (i = 0; i < no_of_chars; i++)
        if (count1[i] != count2[i])
            return false;

    return true;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str1[] = ("srivathsan").toCharArray();
        char str2[] = ("srivatsan").toCharArray();
 
        // Function call
        if (areanagram(str1, str2))
            System.out.println("The two strings are"
                               + "anagram");
        else
            System.out.println("The two strings are not"
                               + " anagram");

	}

}
