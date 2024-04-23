/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author mehak*/
class B1_Addmission2 {
    
    public static void main(String[] args) 
    {
   
     long startTime = System.nanoTime(); 
  
       
      
    Thread st= new Thread()
    {
        public void run()       //#1 thread
        {
        try {
            
            
                for(int i=0; i<50; i++)
                {

                }
                System.out.println("1. You have taken the admission successfully ");
          } catch (Exception e) {
        }
    }
};
st.start();
    
        try {
            st.join();
        } catch (Exception e) {
        }
Thread st2= new Thread()
{
     public void run()  // #2 thread
    {
        try {
          
        for(int i=0; i<50; i++)
        {

        }
        System.out.println("2. Your fees is submitted ");
      
        } catch (Exception e) {
        }
    }
};
st2.start();
try {
            st2.join();
        } catch (Exception e) {
        }
  Thread st3= new Thread()
  {
     public void run()  // #3 Thread
    {
        try {
           
        for(int i=0; i<50; i++)
        {
        }
        System.out.println("3. You can take the roll no. ");
     
        } catch (Exception e) {
        }
        
          }
};
    st3.start();
    long endTime = System.nanoTime(); 
       long executionTime = (endTime - startTime);
       double microSecond=executionTime/1000.0;

       System.out.println("Execution Time: " + microSecond );
  
    }
    
}