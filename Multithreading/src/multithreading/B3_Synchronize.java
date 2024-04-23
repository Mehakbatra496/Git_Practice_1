/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author mehak
 */
public class B3_Synchronize
{ 
     public static void main(String[] args)
	{
            ThreadClass tc1= new ThreadClass("Neha", 4);
            ThreadClass tc2= new ThreadClass("priya", 3);
            ThreadClass tc3= new ThreadClass("Amit", 7);
            tc1.start();
            tc2.start();
            tc3.start();		
	}
}		
class ThreadClass extends Thread
    {
        static BookTicket bt= new BookTicket(); //all threads will share the same instance of bookTicket
	//send name and tickets through constructor next time...
	String name; int tickets;
	ThreadClass(String name, int tickets)
	{
		this.name= name;
		this.tickets=tickets;
	}
	public void run()
	{
            try {
 
		bt.booking(name, tickets);
                                   
            } catch (Exception e) 
             {
            
             }              
	}
}
class BookTicket
{
	String name; int tickets;
	int total_tickets=15;
	synchronized public void booking(String name, int tickets)
	{
		this.name= name;
		this.tickets= tickets;
		if(total_tickets>=tickets)
		{
                    try {                       
//                       Thread.sleep(2000);
                        }
                    catch (Exception e) 
                    {
                        
                    }

		total_tickets = total_tickets-tickets;
		System.out.println(name +" has booked "+tickets+", Remaining tickets are "+total_tickets);
		}
		//System.out.println("Remaining tickets are "+total_tickets);
	}	
}	


