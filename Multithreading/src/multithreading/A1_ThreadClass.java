/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

/**
 *
 * @author mehak
 */
public class A1_ThreadClass extends Thread{

   public static void main(String args[])
	{
		A1_ThreadClass e1= new A1_ThreadClass();
		//Employees e2 = new Employees("Kamal", 9945);
		System.out.print("I am thread  ");
		System.out.println(Thread.currentThread().getName());
		e1.start();
                e1.run(10);
		//e2.start(); 
        }	
	
   @Override 
	public void run()
	{
		//System.out.println("I am thread 1 ", Thread.currentThread().getName());
	System.out.print("I am thread  ");
	System.out.println(Thread.currentThread().getName());
	
	
	}
        
        public void run(int a)
        {
            int k ;
            k=a;
            System.out.println(k);            
        }
 }

    

