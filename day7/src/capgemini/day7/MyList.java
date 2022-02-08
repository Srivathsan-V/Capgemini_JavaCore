package capgemini.day7;


import java.util.*;
public class MyList {

	public static void main(String args[])
	{
		//interface left    //implemented class on right side
		//Array as implementation
		ArrayList<String> ls=new ArrayList<String>();
		ls.add(0, "John");
		ls.add(1, "Jack");
		ls.add(2, "Jeff");
		ls.add(3, "Jona");
		ls.add(4, "Joh");
		ls.add(5, "Joe");
		ls.add(6, "Jill");
		ls.add(7, "Jay");
		//LinkedList as implementation
		List<String> ls1=new LinkedList<String>();
		
		//FIFI
		//
		List<String> ls2=new Stack<String>();
		
		ls2.add("A");
		//Array
		//Thread safe
		List<String> ls4=new Vector<String>();
	}
}

