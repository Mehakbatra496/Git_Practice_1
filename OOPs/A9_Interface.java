public class A9_Interface
{
 public static void main(String args[]) {
        Main mm = new Main();
        mm.getData();
    }
    }
interface A1
{
	int a=5;
	default void getData()
	{
		System.out.println("Value is "+a);
	}	
}
class Main implements A1 
{
        int a = 99;
        public void getData()
	     {
	    	A1.super.getData();	// will call parent class method
	    
	      //  System.out.println("Value is " + a);
	     }
}


