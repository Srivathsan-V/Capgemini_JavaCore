package capgemini.day4;

public class Sumofelementsinarray {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 5, 7, 9, 12, 18 };
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}
		System.out.println("Sum of all the elements of an array: " + sum);
	}
}
