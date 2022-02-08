package capg.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;

class CException{
	public void myNewException() throws FileNotFoundException
	{
		FileInputStream inputStream = new FileInputStream("c:\\doc1.txt");
	}
}

public class Throws {

	public static void main(String[] args) {
		try
		{
		CException exception=new CException();
		
		exception.myNewException();
		}
		
		//you can have multiple catch block
		//child should come before parent class
	
		catch(FileNotFoundException e)
		{
			
		}
		catch(FileSystemNotFoundException e)
		{
			
		}
		catch(NullPointerException e)
		{
			
		}
		catch(Exception e)
		{
			
		}
		

	}

}
