class Parent 
{ 
    // Static method in base class 
    static void showData() 
    { 
        System.out.println("This is Static method of Parent class"); 
    } 
} 
  
class Child extends Parent 
{ 
    // static method in drived class
    static void showData()
    { 
        System.out.println("This is Static method of child class"); 
    } 
} 
  
class B2_Overriding { 
    public static void main(String[] args) 
    { 
        Parent parent = new Child(); 
        
        
        parent.showData();      
    } 
}