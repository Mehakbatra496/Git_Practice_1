public class A4_Constrcutor
{
    int a, b; 
    
     public A4_Constrcutor(int x, int y) 
        { 
             a = x; b = y;
        }
   
     public A4_Constrcutor() 
        { 
            this(10, 10);  //calling the parameterized constructor by value 10,10
        }
     public int getX() 
  { 
      return a; 
  }
    public static void main(String args[]) 
    {
        A4_Constrcutor p = new A4_Constrcutor(); //calling deafault 
    System.out.println(p.getX());
    }
}

