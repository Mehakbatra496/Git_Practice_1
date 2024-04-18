public class B5_Composition {
    
    public static void main(String[] args) {
        Car c= new Car("Duster", "324HF");
        
        c.showCarDetails();
    }
}

class Car
{
    String cname,cmodel;
    Engine e;
    public Car(String name, String Model) 
    {
        e= new Engine("PowerHigh", "ABCtype");
        cname=name;
        cmodel=Model;        
    }     
    
  public void showCarDetails()
    {
        System.out.println("Car has " + cname +" "+ cmodel );
        System.out.println("Engine has "+e.eengine +" "+ e.etype);
    }
}

class Engine
{
    String eengine, etype;
    public Engine(String engine, String type)
    {
        eengine= engine;
        etype=type;
    }
}