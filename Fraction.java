
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
    
    public Fraction Simplify(){ //simplifying with greatest common denominator
        int gcd = 1;
        for(int i=1; i<=n && i<=d; i++){
            if(n%i==0 && d%i==0){
                gcd = i;
            }
        }
        int num = n/gcd;
        int den = d/gcd;
        return(new Fraction(num,den));
    }
    
    public Fraction Add(Fraction frac){ //addition
        int n2 = frac.Numerator();
        int d2 = frac.Denominator();
        int num = (n*d2)+(n2*d);
        int den = (d*d2);
        return(new Fraction(num,den));
    }
    
    public Fraction Multiply(Fraction frac){ //multiplication
        int n2 = frac.Numerator();
        int d2 = frac.Denominator();
        int num = n*n2;
        int den = d*d2;
        return(new Fraction(num,den));
    }
}
