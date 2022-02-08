package capgemini.day4;

class Test2 {
	static int arr1[] = { 10, 324, 45, 90, 980 };

	static int smallest() {
		int i;
		int min = arr1[0];

		for (i = 1; i < arr1.length; i++)
			if (arr1[i] < min)
				min = arr1[i];

		return min;
	}
}

public class Minelementinarray {

	public static void main(String[] args) {
		System.out.println("Smallest in given array is " + Test2.smallest());
	}

}


