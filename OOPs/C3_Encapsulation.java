/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mehak
 */
public class C3_Encapsulation 
{
    	public static void main(String[] args)
	{
		String name; int age;
		Student ss= new Student();

		ss.setName("Neha");
		ss.setAge(34);
		
		name= ss.getName();
		age= ss.getAge();
		
		System.out.println(name);
		System.out.println(age);
	}
}
class Student
{
	private String name;
	private int age;
	private boolean flag= false;
	
	public void setName(String name)
	{
		this.name=name;
                
                        System.out.println("Thread name : "+Thread.currentThread().getName());

	}
	
	public void setAge(int age)
	{
		this.age=age;
		if(age>16)
		{
			flag = true;
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		        System.out.println("Thread name : "+Thread.currentThread().getName());

			if(flag==true)
			{
				System.out.println("you are eligible to take addmission");
			}
			return age;
	} 
}