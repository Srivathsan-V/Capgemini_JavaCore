package capgemini.day9;

import java.util.Comparator;

//Comparator
//Generic parameters
//Implement the method of interface(Compare
//Sorting the Employee with id
public class Salarycomparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getSalary()>e2.getSalary())
		{
		return 1;
		
		}
		else if(e1.getSalary()<e2.getSalary())
		{
		 return -1;
		 
		}
		else
		{
		return 0;	
		}
		
		//return 0;
	}

}




