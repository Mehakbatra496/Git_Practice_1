package multithreading;
  public class B2_Synchronize {
      public static void main(String[] args)
      {
        MyThread mt1 = new MyThread();
        mt1.start();

        MyThread mt2 = new MyThread();
        mt2.start();
    }
}

class MyThread extends Thread 
{
    public void run() 
   {
        synchronized (this) {
  try {
            for (int i = 1; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }

   
}
