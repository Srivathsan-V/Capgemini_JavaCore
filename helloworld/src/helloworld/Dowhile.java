package helloworld;

public class Dowhile {

	public static void main(String[] args) {
		int i = 1;
		do {
			if(i%3==0) {
				System.out.println("Multiples of 3:"+i);
			}
			i++;
		}
		while(i<50);

	}

}
