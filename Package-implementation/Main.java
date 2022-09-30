import Fibonacci.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FibonacciGenerator obj=new FibonacciGenerator();
        obj.generate(n);
    }
}