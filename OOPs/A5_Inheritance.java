public class A5_Inheritance {
    
    public static void main(String[] args) {
        
        Swift sw=new Swift();
        Duster al= new Duster();
        
        sw.getCarDetails();
        sw.getDetails();
        al.getCarDetails();
        al.getDetails();
        
    }
}



class Car
{
	String name="Sujuki";
	String company= "AF Motors";
	int wheel=4;	
	
	void getCarDetails()
	{
		System.out.println(name);
		System.out.println(company);
		System.out.println(wheel);
		//System.out.println(isAcAvailable);
		
	}
}

class Swift extends Car
{
	String name= "Swift";
	int year=1999;
	String model="A6gh2";
	boolean isAcAvailable=true;	
	
	void getDetails()
	{
		System.out.println(name);
		System.out.println(year);
		System.out.println(model);
		System.out.println(isAcAvailable);		
	}
}


class Duster extends Car
{
	String name= "Duster";
	int year=2017;
	String model="kljo";
	boolean isAcAvailable=false;	
	
	
	void getDetails()
	{
		System.out.println(name);
		System.out.println(year);
		System.out.println(model);
		System.out.println(isAcAvailable);		
	}
}

