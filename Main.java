
/**
 * The class that is run to execute the program
 *
 * Tyler Dolph, Brian Hansen
 * 10/5/2020
 */
public class Main
{
    public static void main(String[] args){
        //defining fractions
        Fraction frac0 = new Fraction(1,2);
        Fraction frac1 = new Fraction(2,3);
        
        //math
        frac0.Add(frac1); 
        frac1.Multiply(frac1);
        
        //outputs
        System.out.println(frac0.ToString());
        System.out.println(frac1.ToString());
    }
}
