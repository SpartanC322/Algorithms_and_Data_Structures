import javax.swing.*;

public class TestClass
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 1;
        int c = 5;

        //Smallest is 1
        JOptionPane.showMessageDialog(null,"Smallest value: " + MyMath.myMin(a, b, c));

        //2
        JOptionPane.showMessageDialog(null,"A to the power of B: " + MyMath.myPow(a,b));

        //15
        JOptionPane.showMessageDialog(null,"The MySum of C: " + MyMath.mySum(c));

        //
        JOptionPane.showMessageDialog(null,"Factorial of A: " + MyMath.myFactorial(a));
    }
}
