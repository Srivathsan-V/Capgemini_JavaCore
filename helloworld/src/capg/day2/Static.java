package capg.day2;
	class students {
	    static class Address {
	        int houseNo;
	        String streetName;
	        public void print() {
	            System.out.println("Nested class");

	        }

	 
	    }
	    static {
	        System.out.println("I am static");
	    }
	 
	    public String toString() {
	        return "Student [rollno=" + rollno + ", name=" + name + " School name " + schoolName + "]";
	    }
	 
	    public students(int rollno, String name) {
	        super();
	        this.rollno = rollno;
	        this.name = name;
	    }
	 
	    private int rollno;
	    private String name;
	    // static variable
	    static String schoolName;
	 
	    // static method
	    public static void staticMethod() {
	        System.out.println("School Name" + schoolName);
	    }
	 
	}
	 
	public class Static {
	 
	    public static void main(String args[]) {
	 
	        students.schoolName = "Abc school";
	 
	        students s1 = new students(1001, "Ansar");
	        students s3 = new students(1002, "Priya");
	        students s2 = new students(1003, "Mahesh");
	 
	        System.out.println(s1);
	        System.out.println(s2);
	        System.out.println(s3);
	 
	        students.staticMethod();
	 
	        students.Address address = new students.Address();
	        address.print();
	 
	    }
	 
	}


