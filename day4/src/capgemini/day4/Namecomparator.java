package capgemini.day4;


import java.util.Comparator;

//Comparator
//Generic parameters
//Implement the method of interface(Compare
//Sorting the Employee with id
public class Namecomparator implements Comparator<EmployeeM>{

	@Override
	public int compare(EmployeeM e1, EmployeeM e2) {
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName());
	}

}


