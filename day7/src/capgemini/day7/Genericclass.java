package capgemini.day7;

class Person<T, V, Z> {
	private T name;
	private V id;
	private Z salary;

	public Person(T name, V id, Z salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void printPerson() {
		System.out.println(" Name: " + this.name);
		System.out.println(" ID:   " + this.id);
		System.out.println("Salary: " + this.salary);
	}

}

public class Genericclass {

	public static void main(String args[]) {
		Person<String, Float, Integer> p1 = new 
				Person<String, Float, Integer>("Srivathsan", 34f, 50000 );

		p1.printPerson();
		
		Person<Integer, Integer, Integer> p2 = new 
				Person<Integer, Integer, Integer>(100, 150, 160);
		p2.printPerson();
	}
}
