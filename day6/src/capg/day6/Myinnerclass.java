package capg.day6;

interface Anonymous{
	int a = 60;
	public void print();
}

class Outerclass{
	
	innerclass inner = new innerclass();
	
	public void printouterclass() {
		System.out.println("Outer class");
		
		inner.printinnerclass();
	}
}

class innerclass{
	public void printinnerclass() {
		System.out.println("Inner class");
	}
}

public class Myinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outerclass outer = new Outerclass();
		outer.printouterclass();
		
		Anonymous A=new  Anonymous() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Anoymonus Inner class");
				System.out.println(a);
			}
		};
		
		A.print();

	}

}
