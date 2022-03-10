package capgemini.day10;

interface testInterface{
	//static method
	static void printmethod() {
		System.out.println("This is Static method");
	}
	
	//default method
	default public void show() {
		System.out.println("This is default method");
	}
	
}


public class Mymethods implements testInterface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testInterface.printmethod();
		Mymethods mm = new Mymethods();
		mm.show();
		String s = "Srivathsan";
		System.out.println(s.charAt(0));
		
		
		}
	
}	


