/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Deepak
 */
class MyThread3 extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().isInterrupted());
        try
        {
            for(int i=1; i<=5; i++)
            {
                System.out.println("child : "+i);
//                Thread.sleep(100);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            for(int i=1; i<=5; i++)
            {
                System.out.println("child 2 : "+i);
                Thread.sleep(100);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (3) : "+Thread.interrupted());

    }
}
public class A7_ThreadInterrupt
{
    public static void main(String[] args)
    {
        MyThread3 mt=new MyThread3();
        mt.start();
                System.out.println(Thread.currentThread().isInterrupted());

//        mt.interrupt();
    }
}