package Fibonacci;
public class FibonacciGenerator
{
    public void generate(int n)
    {
        int x=0;
        int y=1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(x+" ");
            int z=x+y;
            x=y;
            y=z;
        }
    }
}