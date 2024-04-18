public class A8_Interface
{
	public static void main(String args[])
	{
		Mobile mm= new Mobile();
		Smartphone sm= new Smartphone();		
		System.out.println("Mobile Details.......... ");
		mm.operates();
		mm.makeCall();
		mm.sendSms();

		System.out.println(" ");
		System.out.println("Smartphone Details.......... ");
		sm.operates();
		sm.makeCall();
		sm.sendSms();	
		sm.record();
		sm.takePhoto();
		sm.play();
	}
}

class Device					// parent class
{
	public void operates()
	{
		System.out.println("A calling Device ");
	}
}



interface communication				// an interface
{
	public void makeCall();
	public void sendSms();
}


//class extends class and (two / mutiple inheritance) interfaces

class Mobile extends Device implements communication	
{
	String model="A09"; int price = 3000; 	String game="Sudoko";
	
	public void getMobileDetails()
	{
		System.out.println("Model is "+model+" Price is "+price);
	}
	public void makeCall()
	{
		System.out.println("Mobile can make calls ");	
	}
	
	public void sendSms()
	{
		System.out.println("Mobile can send SMS");
	}
	
}

interface Games					// An interface
{			
	public void play();
}

interface multimedia extends Games		// interface extending interface
{	
	public void  record();
	public void takePhoto();
}

// cass extends class and interfaces
class Smartphone extends Device implements communication , multimedia
{
	String model="R665t"; int price = 20000;
	String game="Car Rush";
		
	
	public void getSmartDetails()
	{
		System.out.println("Model is "+model+" Price is "+price);
	}
	
	public void makeCall()
	{
		System.out.println("Smartphone can make calls ");	
	}
	
	public void sendSms()
	{
		System.out.println("Smartphone can send SMS");
	}

	public void record()
	{	
		System.out.println("It can record ");
	}
	
	public void takePhoto()
	{
		System.out.println("It can take photos ");
	}
	
	public void play()
	{
		System.out.println("Sudoko");
	}
}