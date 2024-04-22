class Mythread7 extends Thread
{
    public void run()
        {
           try
            {
                     for( int i=1; i<=5; i++)
                     {
                          Thread.currentThread().sleep(1000);                        // sleep the Thread
                          System.out.println("java 1 here");     
                                    //   Thread.yield();
   

                     }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
}

class Mythread7_1 extends Thread
{   

    Thread tt;
    Mythread7_1(Thread tt)
    {
        this.tt=tt;
    }

    public void run()
        {
           try
            {
                tt.join(1000);                       //Either use join this way or look there in the main method
                   for( int i=1; i<=5; i++)
                   {
                //    Thread.yield();    
                //    Thread.currentThread().sleep(1000);                         // sleep the Thread
                   System.out.println("java 2 here");  

                   }
            }
    
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
}

class Thread7
{
    public static void main(String args[]) throws InterruptedException
    {
        Mythread7 tt=new Mythread7();
        Mythread7_1 tt1=new Mythread7_1(tt);
        // tt1.yield();
        tt.start();
        // tt.join();
        tt1.start();

        // for( int i=1; i<=5; i++)
        //            {
        //            Thread.currentThread().sleep(1000);                         // sleep the Thread
        //            System.out.println("java main here");    
        //            }
    }

}