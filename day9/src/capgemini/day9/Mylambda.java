package capgemini.day9;

//Lamda--which force us to do the function programining 
//Top to bottom approach 

//Java 1.8 features 
//Lamda
//Stream APi
//Date Time


//create a lamda

//Create Lamda for Find Given Number is positive or Negative
//Create Lamda to return sequre of given number
//create Lamda to pass String and return in Upper case
//Create Lamda to pass string and return the lenght of String


interface PosorNeg{
	public void posorneg(int a);
	
}

interface Squareofnum{
	public void squareofnum(int a);
}

interface Lengthofstring{
	public void lenofstr(String s);
}

interface StringinUpper{
	public void strinupper(String s);
}
interface MyCode
{
public void print();	
}

interface MySum
{
public void sum(int a,int b);	
}

@FunctionalInterface
//functional interface- which contain only method
//@FunctionalInterface annottion
interface EvenOrODD
{
public String findValue(int a);
}
public class Mylambda {

public static void main(String args[])
{   
	
	//storing the value into variable
	int a=10;
	System.out.println(a);
	
	//java 8 allow use to store the code (function )inside java vairable
	//pass the function or method to java code
	//Type is not allowed because it is going to store in variable(Access Modifier)
	//remove return type because whatever value you return i will understand 
	//method name -add lamda with method name ->
	//remove the method name because we are not calling variable name 
	//if you have lamda on rightside you must have interface 
	//java says if one line code is there you can remove opening and closing bracket
	//with code variable you will able to run ti
	MyCode code=()->System.out.println("My Method");
	//execute the code late
	code.print();
	
	MySum sum=(x,z)->{
		
		int c=x+z;
		System.out.println(c);
		};
   sum.sum(10, 20);
   
   PosorNeg p = (x)->{
	   if(x>0) {
		   System.out.println("The number is positive");
		   
	   }
	   else {
		   System.out.println("The number is negative");
	   }
   };
   p.posorneg(a);
   
   Squareofnum s = (x)->{
	   System.out.println( "The square of number is "+ x*x);
   };
   s.squareofnum(a);
   
   String b = "Srivathsan";
   StringinUpper s1 = (y)->{
	   y = y.toUpperCase();
	   System.out.println("The String in Uppercase: "+y);
   };
   s1.strinupper(b);
   
   Lengthofstring s2 = (z)->{
	   System.out.println("The length of String: "+ z.length());
   };
   s2.lenofstr(b);
 
  System.out.println(evenOrOddValue(10));
  
  //will find the wheter number id even or odd
  //interface 
  //functional interface
 //function parameters you can also ignore 
  EvenOrODD  evenorOdd= number->
  {
  	 if(number%2==0)
  	 {
  	  return "Even "+number;   
  	 }
  	 else
  	 {
  		return "ODd "+number; 
  	 }
  	};

  	String str=evenorOdd.findValue(11);
  	System.out.println(str);
}

public static String evenOrOddValue(int a)
{
if(a%2==0)
{
return "Even "+a;   
}
else
{
	return "ODd "+a; 
}
}

public void sum(int a, int b)
{
int c=a+b;
System.out.println(c);
}
public void print()
{
System.out.println("My Method");	
}

	
}