package capgemini.day4;
import java.util.Scanner;
public class Arrayinputandprinting {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the Array size:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int[] arr = new int[num];
		
		System.out.println("Enter the Array Elements");
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]);
		}

	}

}
