package capgemini.day9;

import java.util.Comparator;

//Comparator
//Generic parameters
//Implement the method of interface(Compare
//Sorting the Employee with id
public class Idcomparator implements Comparator<MyEmployee>{

	@Override
	public int compare(MyEmployee e1, MyEmployee e2) {
		// TODO Auto-generated method stub
		if(e1.getId()>e2.getId())
		{
		return 1;
		
		}
		else if(e1.getId()<e2.getId())
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



