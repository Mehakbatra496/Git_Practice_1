    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package multithreading;

    /**
     *
     * @author mehak
     */
    public class A3_ThreadMethod
    {
        public static void main(String[] args)
        {        
            Game g1= new Game();
              g1.setName("Game Thread");
            g1.start();
//            g1.setDaemon(true);
            g1.setPriority(10);
//            System.out.println(g1.isAlive());
//              System.out.println( g1.isDaemon());
//              System.out.println( g1.isInterrupted());
//           
//              System.out.println( g1.getClass());
//             g1.checkAccess();
//              System.out.println( g1.getId());
//             System.out.println(  g1.getName());
//            System.out.println(   g1.getStackTrace());
//     System.out.println(  "state......... "+ g1.getState()); //Blocked or runnable
//              System.out.println( g1.getPriority());     //5
//             System.out.println(  g1.getThreadGroup()); //Thread 0
                    }

    }
    class Game extends Thread
    {
        Media m1= new Media();        
        
        public void run()
         {
           //  System.out.println( "Thread group is "+ Thread.currentThread().getThreadGroup()); //Thread 0
             System.out.println(Thread.currentThread().getName());
             System.out.println(  "curent state............... " +Thread.currentThread().getState()); //
             System.out.println(Thread.currentThread().getPriority());

             m1.start();
         }

    }

class Media extends Thread
{
    public void run()
    {
        System.out.println("Media Thread");
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
    }
}


