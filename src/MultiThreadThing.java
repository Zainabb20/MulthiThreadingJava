public class MultiThreadThing
{
    public static void main(String[] args)
    {
        Multi m=new Multi(6);
        Multi m1=new Multi(5);
        m.start();
        m1.start();
    }
}