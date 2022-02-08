package capg.day6;
import java.util.Scanner;

class OnlyPositiveNumberAllowed extends Exception{
	
	public OnlyPositiveNumberAllowed(String msg) {
		super(msg);
		
	}
	
}

public class MyException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    
		    int number =sc.nextInt();
		    
		    //OnlyPostiveNumberAllowed
		    //
		    if(number>0)
		    {
		    	//even off logic will come
		    }
		    else
		    {
		    	//System.out.println("Only Positive Number are allow");
		    	//to use throw keyword
		    throw new OnlyPositiveNumberAllowed("Only Positive Number are allow");	
		    }
		}

	}


