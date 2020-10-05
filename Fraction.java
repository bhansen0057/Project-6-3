
/**
 * Write a description of class Fraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private int n;
    private int d;

    public Fraction(int num,int den){
        n = num; 
        d = den;
    }
    
    public String ToString(){return(n+"/"+d);}
    
    public void Add(int n2, int d2){
        n = (n*d2)+(n2*d);
        d = (d*d2);
    }
}
