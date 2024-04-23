/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author mehak
 */
public class A9_ThreadJoin {
    
    public static void main(String[] args) 
    {
        
     StudentAdmission st= new StudentAdmission();
             long startTime = System.nanoTime(); 

     st.takeAdmission();
     st.depositFee();
     st.getRollNo();
     
      long endTime = System.nanoTime(); 
        long executionTime = (endTime - startTime);
        double microSecond=executionTime/1000.0;

            // Convert nanoseconds to the current time unit

            System.out.println("Execution Time: " + microSecond );
       
    }
}

class StudentAdmission
{
    public void takeAdmission()
    {
        for(int i=0; i<50; i++)
        {
            
        }
        System.out.println("You have taken the admission successfully ");
    }
    
    public void depositFee()
    {
                for(int i=0; i<50; i++)
                {
                    
                }
        System.out.println("Your fees is submitted ");
    }
    
    public void getRollNo()
    {
                for(int i=0; i<50; i++)
                {
                }
        System.out.println("You can take the roll no. ");
    }
    
}
