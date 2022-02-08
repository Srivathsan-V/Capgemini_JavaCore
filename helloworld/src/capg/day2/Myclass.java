package capg.day2;
class Student{
	String name;
	int rollno;
	String Schoolname;
	
	Student(String name,int rollno,String Schoolname){
		this.name = name;
		this.rollno = rollno;
		this.Schoolname = Schoolname;
	}
}
class Laptop{
	String brand;
	int price;
	int ram;
	
	Laptop(String brand,int price,int ram){
		this.brand = brand;
		this.price = price;
		this.ram   = ram;
	}
	public void setbrand(String brand) {
		this.brand = brand;
	}
	public void setprice(int price) {
		this.price = price;
		
	}
	public void setram(int ram) {
		this.ram = ram;
	}
	public String getbrand() {
		return this.brand;
	}
	public  int getprice() {
		return this.price;
	}
	public int getram() {
		return this.ram;
	}
	public void print() {
		System.out.println("Brand" + this.brand);
		System.out.println("Price" + this.price);
		System.out.println("Ram" + this.ram);
	}
}
class bike{
	String brand;
	int mileage;
	int cc;
	int price;
	
	bike(String brand,int mileage,int cc,int price){
		this.brand = brand;
		this.mileage = mileage;
		this.cc = cc;
		this.price = price;
	}
	bike(){
		
	}
	public void setbrand(String brand) {
		this.brand = brand;
	}
	public void setmileage(int mileage) {
		this.mileage = mileage;
		
	}
	public void setcc(int cc) {
		this.cc = cc;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public String getbrand() {
		return this.brand;
	}
	public int getmileage() {
		return this.mileage;
	}
	public int getcc() {
		return this.cc;
	}
	public int getprice() {
		return this.price;
	}
	public String getbrand1(String brand) {
		// TODO Auto-generated method stub
		return this.brand;
	}
}

public class Myclass {

	public static void main(String[] args) {
		Student s1 = new Student("John",120,"ABC");
		Student s2 = new Student("Abraham",121,"XYZ");
		Student s3 = new Student("Adam",123,"JKL");
				
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s1.Schoolname);
		System.out.println(s2.name);
		System.out.println(s2.rollno);
		System.out.println(s2.Schoolname);
		System.out.println(s3.name);
		System.out.println(s3.rollno);
		System.out.println(s3.Schoolname);
		
		Laptop l1 = new Laptop("Dell",50000,8);
		Laptop l2 = new Laptop("HP",100000,16);
		Laptop l3 = new Laptop("Samsung",70000,8);
		
		System.out.println(l1.getbrand());
		System.out.println(l1.getprice());
		System.out.println(l1.getram());
		
		System.out.println(l2.getbrand());
		System.out.println(l2.getprice());
		System.out.println(l2.getram());
		
		System.out.println(l3.getbrand());
		System.out.println(l3.getprice());
		System.out.println(l3.getram());
		
		bike b1 = new bike("Yamaha",40,150,120000);
		bike b2 = new bike();
		b2.setbrand("ROYAL ENFIELD");
		b2.setmileage(30);
		b2.setcc(410);
		b2.setprice(250000);
		bike b3 = new bike();
		b3.setbrand("TVS");
		b3.setmileage(50);
		b3.setcc(125);
		b3.setprice(70000);
		
		System.out.println(b2.getbrand());
		System.out.println(b2.getmileage());
		System.out.println(b2.getcc());
		System.out.println(b2.getprice());
		
		System.out.println(b3.getbrand());
		System.out.println(b3.getmileage());
		System.out.println(b3.getcc());
		System.out.println(b3.getprice());
		
		System.out.println(b1.getbrand());
		System.out.println(b1.getmileage());
		System.out.println(b1.getcc());
		System.out.println(b1.getprice());
		
	

	}

}
