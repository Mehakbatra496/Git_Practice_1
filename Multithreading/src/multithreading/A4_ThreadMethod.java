/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author mehak
 */
    


class MyThread4 extends Thread
{
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(i+" : "+Thread.currentThread().getName());
        }
    }
}
public class A4_ThreadMethod {
    public static void main(String[] args)
    {
        MyThread4 mt4=new MyThread4();
        mt4.start();
        
        Thread.yield();
        
        for(int i=1; i<=10; i++)
        {
            System.out.println(i+" : "+Thread.currentThread().getName());
        }
    }
}



