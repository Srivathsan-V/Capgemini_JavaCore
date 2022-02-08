package helloworld;

public class Compoundinterest {

	public static void main(String[] args) {
		int p = 2000;
		double r = 0.08;
		int t = 5;
		int n = 12;
        double CI = (p * Math.pow(1 + (r / n), n * t)) - p;
        System.out.println("COMPOUND INTEREST: "+CI);

		
	}

}
