package capg.day2;

public class Concatenatearrays {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int arr2[] = {23,24,25,26,27};
		int large = arr[0];
		int pos = 0;
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		int result[] = new int[arr.length +arr2.length];
		for(int i=0;i<arr.length;i++) {
			result[i] = arr[i];
			pos++;
		}
		for(int i=0;i<arr2.length;i++) {
			result[pos] = arr2[i];
			pos++;
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}


	}

}
