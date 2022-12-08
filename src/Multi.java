public class Multi extends Thread
{
    int threadNumber;
    Multi(int threadNumber)
    {
        this.threadNumber=threadNumber;
        for (int i=1;i<5;i++)
        {
            System.out.println("Number of Threads:"+i);


        }
    }

    public void run()
    {
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        System.out.println("Thread is running!!");
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
