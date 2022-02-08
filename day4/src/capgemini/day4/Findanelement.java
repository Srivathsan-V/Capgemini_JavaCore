package capgemini.day4;

import java.util.Scanner;

public class Findanelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an element to search:");
		Scanner Sc2 = new Scanner(System.in);
		int Sc3;
		int j;
		boolean k = false;
		Sc3 = Sc2.nextInt();
		int[] arr1 = new int[] { 2, 4, 6, 7, 8 };
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == Sc3) {
				j = i;
				k = true;
				System.out.println("Element is Found at: " + j);
				break;
			}

		}
		if (k == false) {
			System.out.println("Elment is not found");
		}

	}

}
