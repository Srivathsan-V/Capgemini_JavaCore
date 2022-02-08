package helloworld;

	public class Addtwocomplexnumbers {

	    double real;
	    double imag;

	    public Addtwocomplexnumbers(double real, double imag) {
	        this.real = real;
	        this.imag = imag;
	    }

	    public static void main(String[] args) {
	        Addtwocomplexnumbers n1 = new Addtwocomplexnumbers(2.3, 4.5),
	                n2 = new Addtwocomplexnumbers(3.4, 5.0),
	                temp;

	        temp = add(n1, n2);

	        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
	    }

	    public static Addtwocomplexnumbers add(Addtwocomplexnumbers n1, Addtwocomplexnumbers n2)
	    {
	        Addtwocomplexnumbers temp = new Addtwocomplexnumbers(0.0, 0.0);

	        temp.real = n1.real + n2.real;
	        temp.imag = n1.imag + n2.imag;

	        return(temp);
	    }

}
