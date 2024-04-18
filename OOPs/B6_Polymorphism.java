public class B6_Polymorphism
{

	public static void main(String args[])
	{
		Value v= new Value(12);
		Value v1= new Value(12,90);
				
				
		
	//	v.fun(5);
	//	v.fun(14,78);
		
	}
}

 class Value
{
	int a , b;
	
	Value(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	Value(int a, int b)
	{
		this.a=a;
		this.b=b;
		
		System.out.println(a+" "+b);
	}
	void fun(int a )
	{
		this.a=a;
		
		System.out.println(a);
	}
	
	void fun(int a , int b)
	{
		this.a=a;
		this.b=b;
		
		System.out.println(a+" "+b);
	}

	
		
}