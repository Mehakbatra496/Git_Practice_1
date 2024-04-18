public class A1_Animal
{

	public static void main(String[] args)
	{
		Horse an= new Horse();
		//an.age=3;
		//System.out.println(an.name);		
		//System.out.println(an.age);	
		int k=an.getAge();	
		System.out.println(k);	
	}

}
 class Horse
{
	private int age=90; String name="Rom";
	
	public int getAge()
	{
		return age;
	}		
}
