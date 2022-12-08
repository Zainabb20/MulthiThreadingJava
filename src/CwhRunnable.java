class Thread5 implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");
        System.out.println("Thread1");

    }
}

class Thread6 implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread2");
        System.out.println("Thread2");
        System.out.println("Thread2");
        System.out.println("Thread2");
        System.out.println("Thread2");
        System.out.println("Thread2");
        System.out.println("Thread2");
        System.out.println("Thread2");
        System.out.println("Thread2");
        System.out.println("Thread2");
        System.out.println("Thread2");
        System.out.println("Thread2");
        System.out.println("Thread2");


    }
}
public class CwhRunnable
{
    public static void main(String args[])
    {
        Thread5 t5= new Thread5(); //Class Object
        Thread t= new Thread(t5);  //Assigning
        t.start();
        Thread6 t6 = new Thread6(); //Class Object
        Thread t1= new Thread(t6);  //Assigning
        t1.start();

    }
}
