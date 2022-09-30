class A extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        }
    }
}
class B extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("BBBBBBBBBBBBBBBBBBB");
        }
    }
}
public class Solution
{
    public static void main(String args[])
    {
        A a=new A();
        B b=new B();
        a.start();
        b.start();
    }
}