package capgemini.day10;
import java.util.ArrayList;
import java.util.Scanner;


class CarPoolSystem{
	String[] str;
	ArrayList<CarPoolSystem> ls = new ArrayList<CarPoolSystem>();
	
	
	CarPoolSystem(String name,String email, long phone){
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CarPoolSystem [name=" + name + ", email=" + email + ", salary=" + phone + "]";
	}
	private String name;
	private String email;
	private long phone;
//	public ArrayList<CarPoolSystem> addmembers() {
//		for(int i = 0;i<ls.size();i++) {
//			//name = str[0];
//			//email = str[1];
//			//phone = Integer.parseInt(str[2]);
//			if(email.contains("@")&&(email.endsWith(".Com")|email.endsWith(".Org"))) {
//				ls.add(new CarPoolSystem(name,email,phone));
//				System.out.println(ls);
//			}
//		}
//		return ls;
//	}

}

public class Carpoolsys{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<CarPoolSystem> cp = new ArrayList<CarPoolSystem>();
		System.out.println("Enter the number of members");
		int size = sc.nextInt();
		String[] mystr = new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the member details");
			mystr = sc.next().split(",");
			System.out.println(mystr[0]);
			System.out.println(mystr[1]);
			System.out.println(mystr[2]);
			if(mystr[1].contains("@")&&mystr[1].contains(".com")) {
				
				cp.add(i,new CarPoolSystem(mystr[0],mystr[1],Long.parseLong(mystr[2])));
			}
		
		System.out.println(cp);
		}		
		

		
		

	}


}


