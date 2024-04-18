class Parent1
 { 
    String name = "Ram";
    public void printData()
    {
        System.out.println("This is child printData");
    }
}

class Child1 extends Parent1
{
    int age = 25;
    public void printData1()
    {
//        Parent.super.printData();
        System.out.println("Age of person = "+ age);
    }
    
     public void printData()
    {
        System.out.println("This is child printData");
    }
}

public class B1_Inheritance 
{
    public static void main (String [] args) 
    {
        Child1 child = new Child1();   
        Parent1 parent= child; //type cast / up cast
       
       
            //Child c=(Child) parent;        
        System.out.println(parent.getClass());
//        parent.showData();
        parent.printData();
//        parent.printData1();
    }
}



