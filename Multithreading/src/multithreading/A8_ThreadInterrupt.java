/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deepak
 */
class MyThread6 extends Thread
{
    public void run()
    {
//        System.out.println("Is thread interrupted (1) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        System.out.println("Is thread interrupted (2) : "+Thread.interrupted());
        
        //System.out.println("Is thread interrupted (1) : "+Thread.currentThread().isInterrupted());
        //System.out.println("Is thread interrupted (2) : "+Thread.currentThread().isInterrupted());
    }
}
public class A8_ThreadInterrupt
{
    public static void main(String[] args)
    {
        MyThread6 mt=new MyThread6();
        mt.start();
        
        mt.interrupt();
    }
}