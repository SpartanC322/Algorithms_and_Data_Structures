public class MyMath
{

    public static int myMin(int a, int b, int c)
    {
        int d = b;
        if (a < d)
            d = a;

        if (c < d)
            d = c;

        return d;
    }

    public static int myPow(int a, int b)
    {
        int result = 1;
        for(int i = 1; i <= b; i++)
            result *= a;

        return result;
    }

    public static int mySum(int n)
    {
        int Sum = 0;
        for (int i = 1; i <= n; i++)
            Sum = Sum + i;

        return Sum;
    }

    public static int myFactorial(int n)
    {
        int Fact = n;
        for (int i = 1; i <= n; i++)
            Fact *= i;

        return Fact;
    }
}
