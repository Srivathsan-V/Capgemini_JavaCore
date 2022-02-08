package capg.day2;
import java.util.Scanner;
public class Myarray {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int arr2[] = {23,24,25,26,27};
		int large = arr[0];
		int avg = 0;
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		for(int i = 0;i<5;i++) {
			if(arr[i]>large) {
				large = arr[i];
			}
			avg = arr[i]+avg;
		}
		avg = avg/arr.length;
		System.out.println("LARGEST ELEMENT  " + large);
		System.out.println("AVERAGE " + avg);


	}

}
