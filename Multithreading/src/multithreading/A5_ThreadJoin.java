/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author mehak
 */
public class A5_ThreadJoin 
{    
    public static void main(String[] args) 
    {
//        Thread t1= Thread.currentThread();
        MainClass m1= new MainClass();
        m1.start();
        
        
        
        try
        {
           m1.join();
           for(int i=0; i<10 ; i++)
            {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());
            }
    }
         catch (Exception e) {
        }   
  }
}
class MainClass extends Thread
{
    
    public void run()
    {
        
        for(int i=0; i<50 ; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}