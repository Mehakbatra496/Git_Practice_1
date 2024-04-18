class A
{
	public static void main(String[] args)
	{
		System.out.println("1");
	}
	void show()
	{
		System.out.println("Parent Show");
	}
}
class B extends A
{
	public static void main(String[] args)
	{
		System.out.println("2");
	}
	void show()
	{
		System.out.println("Child Show");
	}
}
public class B9_Overriding
{
	public static void main(String[] args)
	{
		B ob3=new B();
//		ob3.show();
		String[] str={"a", "b", "c"};
		ob3.main(str);
	}
}