package multithreading;

/**
 *
 * @author Deepak
 */
class MyThread2 extends Thread
{
    Thread t;
    MyThread2(Thread t)
    {
        this.t=t;
    }
    public void run()
    {
        try
        {

            for(int i=1; i<=5; i++)
            {
//                System.out.println(t.getName());
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(100);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class A6_ThreadJoin
{
    public static void main(String[] args)
    {
        Thread t=Thread.currentThread();
        MyThread2 mt=new MyThread2(t);
        mt.start();
//        t.join();
        try
        {
            for(int i=1; i<=5; i++)
            {
                System.out.println("in main : "+i);
                Thread.sleep(100);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}