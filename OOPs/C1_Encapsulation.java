/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mehak
 */
public class C1_Encapsulation {
    	public static void main(String[] args)
		{
		StudentKnowledge s = new StudentKnowledge();
		s.getKnowledgeSource();
		//s. setKnowledgeSource("ABC");//will render compile time error 
		}
}
 class StudentKnowledge
{  
       //private variables 
       private String knowledgeSource="MHk Batra";  
      //getter method for knowledgeSource
       public String getKnowledgeSource()
	     {  
	       System.out.println(knowledgeSource);
	       return knowledgeSource;  
	      }
}
