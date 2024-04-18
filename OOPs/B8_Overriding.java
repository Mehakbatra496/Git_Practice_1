
class B8_Overriding
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.show1();

		B b2=new B();
		b2.show2();

		A ab3=new B();
		ab3.show1();	
		
		//a3.show2();			not possible
	}
}
class A
{
	void show1()
	{
		System.out.println("A  show1");
	}
}
class B extends A
{
	void show2()
	{
		System.out.println("B  show2");
	}
	
	void show1()
	{
		System.out.println("B  show1");
	}
}