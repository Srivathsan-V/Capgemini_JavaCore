package capgemini.day4;

class Test {
	static int arr1[] = { 10, 324, 45, 90, 9808 };

	static int largest() {
		int i;
		int maxi = arr1[0];

		for (i = 1; i < arr1.length; i++)
			if (arr1[i] > maxi)
				maxi = arr1[i];

		return maxi;
	}
}

public class Maxelementinarray {

	public static void main(String[] args) {
		System.out.println("Largest in given array is " + Test.largest());
	}

}