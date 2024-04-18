/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mehak
 */
public class B7_MainOverloading 
{
	public static void main(String args[])
	{
		System.out.println("Original Method");	
		B7_MainOverloading om= new B7_MainOverloading();
		
		int[] arr= {34,56,12,34,5};
		om.main(arr);	
		om.main("Hello");
		
	}	
	public static void main (int[] args)
	{
		System.out.println("Overloaded Method");
	}
	public static void main (String args)
	{
		String aargs;
		aargs=args;
		System.out.println(aargs);
	}
	
	
}