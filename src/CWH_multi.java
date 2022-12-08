class Thread1 extends Thread
{
    public void run()
    {
        int i = 0;
        while (i<100)
        {
            System.out.println("Thread1 is running!!");
            System.out.println("Thread1 is running!!");
            i++;
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        int i = 0;
        while (i<100)
        {
            System.out.println("Thread2 is running!!");
            System.out.println("Thread2 is running!!");
            i++;
        }
    }
}
public class CWH_multi
{
    public static void main(String args[])
    {
            Thread1  t1= new Thread1();
            Thread2  t2= new Thread2();
            t1.start();
            t2.start();

    }

}
