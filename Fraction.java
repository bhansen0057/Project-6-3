
/**
 * defines a fraction and has methods for fraction arithmetic
 *
 * Tyler Dolph, Brian Hansen
 * 10/5/2020
 */
public class Fraction
{
    //instance variables 
    private int n;
    private int d;

    public Fraction(int num,int den){ //constructor
        n = num; 
        d = den;
    }
    
    public String ToString(){return(n+"/"+d);} //tostring and accessors
    public int Numerator(){return(n);}
    public int Denominator(){return(d);}
    
    public void Add(int n2, int d2){ //addition
        n = (n*d2)+(n2*d);
        d = (d*d2);
    }
    
    public void Multiply(int n2, int d2){ //multiplication
        n = n*n2;
        d = d*d2;
    }
}
