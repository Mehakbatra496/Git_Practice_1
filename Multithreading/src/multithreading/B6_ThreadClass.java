package multithreading;
public class B6_ThreadClass
{
    public static void main(String[] args)
    {
        Thread t1=new Thread()
        {
        
            public void run()
            {
                for(int i=1; i<=10; i++)
                {
                    System.out.println(Thread.currentThread().getName());
                }
            }
      };
        
        t1.start();
        
        Thread t2=new Thread()
        {
            public void run()
            {
                for(int i=1; i<=10; i++)
                {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        };
        t2.start();
    }
}