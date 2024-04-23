/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author mehak
 */
public class B4_TrainTicket {
    
   
    public static void main(String[] args) {
    
    System.out.println("CHAP GPT");
        ThreadClass tc1 = new ThreadClass("Neha", 4);
        tc1.start();
        try{
        tc1.join();	//I dont want to use join here
           }
       catch(Exception e)
        {
        
        }
	ThreadClass tc2 = new ThreadClass("priya", 3);  
        tc2.start();
	try
	{       
        tc2.join();
        }
        catch(Exception e)
        {
        
        }
        ThreadClass tc3 = new ThreadClass("Amit", 7);
        tc3.start();
    }
}

 class ThreadClass extends Thread 
 {
	    String name;
	    int tickets;


  	  ThreadClass(String name, int tickets)
	     {
		this.name = name;
		this.tickets = tickets;
	    }
	  public void run() 
		{

		BookTicket bt = new BookTicket(name, tickets);
		bt.booking();

		 }
  
}

class BookTicket {
    static int total_tickets = 15; // Make total_tickets static to share among all instances
    String name;
    int tickets;

    BookTicket(String name, int tickets) {
        this.name = name;
        this.tickets = tickets;
    }

    synchronized public void booking() {
        if (total_tickets >= tickets) {
        System.out.println(total_tickets);
            total_tickets = total_tickets - tickets;
	    
            
            System.out.println(name + " has booked " + tickets + ", Remaining tickets are " + total_tickets);
        }
    }
}
