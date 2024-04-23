/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author mehak
 */
public class B1_Addmission {
    
    public static void main(String[] args) 
    {
     long startTime = System.nanoTime(); 
        
     StudentAdmission st= new StudentAdmission();
     DepositFees ds= new DepositFees();
     RollNo rn= new RollNo();
   
     st.start();
        try {
            
     st.join();
        } catch (Exception e) {
        }
     ds.start();
    
     try {
            
            ds.join();
        } catch (Exception e) {
        }     rn.start();
     
       long endTime = System.nanoTime(); 
       long executionTime = (endTime - startTime);
       double microSecond=executionTime/1000.0;

       System.out.println("Execution Time: " + microSecond );
       
    }
}

class StudentAdmission extends Thread
{
    public void run()
    {
        try {
            
      
        for(int i=0; i<50; i++)
        {
            
        }
        System.out.println("1. You have taken the admission successfully ");
          } catch (Exception e) {
        }
    }
    
}

class DepositFees extends Thread
{
     public void run()
    {
        try {
          
        for(int i=0; i<50; i++)
        {

        }
        System.out.println("2. Your fees is submitted ");
      
        } catch (Exception e) {
        }
        }
}

class RollNo extends Thread
{
     public void run()
    {
        try {
           
        for(int i=0; i<50; i++)
        {
        }
        System.out.println("3. You can take the roll no. ");
     
        } catch (Exception e) {
        }
        }
}