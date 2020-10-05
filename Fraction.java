
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
    
    public void Simplify(){ //simplifying with greatest common denominator
        int gcd = 1;
        for(int i=1; i<=n && i<=d; i++){
            if(n%i==0 && d%i==0){
                gcd = i;
            }
        }
        n = n/gcd;
        d = d/gcd;
    }
    
    public void Add(Fraction frac){ //addition
        int n2 = frac.Numerator();
        int d2 = frac.Denominator();
        n = (n*d2)+(n2*d);
        d = (d*d2);
    }
    
    public void Multiply(Fraction frac){ //multiplication
        int n2 = frac.Numerator();
        int d2 = frac.Denominator();
        n = n*n2;
        d = d*d2;
    }
}
