/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author mehak
 */
public class A2_ThreadClass 
{
    
    public static void main(String[] args) 
    {    
        PlayVideo my= new PlayVideo();
        PlaySound my2= new PlaySound();
        
        long startTime = System.nanoTime(); 
        my.start();    
        my2.start();    // I created another thread 

        long endTime = System.nanoTime(); 
        long executionTime = (endTime - startTime);
        double microSecond=executionTime/1000.0;

            // Convert nanoseconds to the current time unit

//            System.out.println("Execution Time: " + microSecond );
        
                        
    }
}
class PlayVideo extends Thread
{
    public void run()
    {
//        Thread.currentThread().setName("Video Thread");
    
        try {
       
        for(int i=0 ;i<15; i++)
        {
//            System.out.print("I am thread  ");
	System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);

        }
        
             
        } catch (Exception e) {
        }
    }
}
class PlaySound extends Thread
{
    public void run()
    {
//     Thread.currentThread().setName("Sound Thread....................");

        try {
               Thread.yield();
        for(int i=0 ;i<10; i++)
            {
    //            System.out.print("I am thread  ");
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);

            }
    
         
        } catch (Exception e) {
        }
    }
}
