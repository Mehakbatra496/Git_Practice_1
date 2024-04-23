
package multithreading;
public class B8_InterestAmount
{
	public static void main(String args[])
	{
		BalanceAmount b1= new BalanceAmount(5000,2); //enter principal amont and interet rate
		b1.start();
		BalanceAmount b2= new BalanceAmount(5000,2);
		b2.start();
		synchronized(b1)
		{
		try
		{
		b1.wait();
		}
		catch (Exception e)
		{}
		System.out.println("Total amount #1 instance is "+b1.total);

		}
                //For second instance
            synchronized(b2)
		{
		try
		{
		b1.wait();
		}
		catch (Exception e)
		{}
		System.out.println("Total amount #1 instance is "+b1.total);

		}
	}
}

class BalanceAmount extends Thread
{
   
    
int principle, interest_rate, interest_amount=0,total=0;
    BalanceAmount(int p, int r)
    {
        principle=p;
        interest_rate=r;
    }
	public void run()
	{
             try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
	synchronized(this)
	{
           
		for(int year=0; year<10; year++)
		{
			interest_amount= interest_amount+(principle*interest_rate)/100;
		               
                }
		
		total= principle+interest_amount;
                total=total+500; // Add bonus
		this.notify();
	}
}
}