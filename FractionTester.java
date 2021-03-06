
/**
 * The class that is run to execute the program
 *
 * Tyler Dolph, Brian Hansen
 * 10/5/2020
 */
public class FractionTester
{
    public static void main(String[] args){
        //defining fractions
        Fraction frac0 = new Fraction(1,2);
        Fraction frac1 = new Fraction(1,4);
        
        //math
        Fraction frac2 = frac0.Multiply(frac1); 
        frac1.Add(frac2);
        
        //simplifying
        frac0.Simplify();
        frac1.Simplify();
        frac2.Simplify();
        
        //outputs
        System.out.println(frac0.ToString());
        System.out.println(frac1.ToString());
        System.out.println(frac2.ToString());
    }
}
