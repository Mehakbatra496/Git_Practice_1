    public class A6_Interface {

        public static void main(String[] args)
        {
            String appname="MyApp", filetype= "Word", bname="Chrome", url="www.google.com",gname="sudoko";
            Smartphone sm= new Smartphone();
            sm.open(appname, filetype);
            sm.browse(bname, url);
            sm.camera();
            sm.play(gname);
        }
    }
    interface OfficeTools
    {
        public void open(String appname, String filetype);
    }
    interface Browser
    {
        public void browse(String bname, String url);
    }
    interface Games
    {

        public void play(String gname);
    }
    
    class Camera 
    {
        long pixels =1000000000;
        public void camera()
        {
            System.out.println("Number f pixels are "+pixels);
        }
    }
    
    //Derived class
   class Smartphone extends Camera implements OfficeTools, Browser, Games
    {
       
       
        public void open(String appname, String filetype)
        {
            System.out.println("It is use to open any file ");
        }
               
        public void browse(String bname, String url)
        {
              System.out.println("It is use to open and search anything ");

        }
       
        public void play(String gname)
        {
              System.out.println("It is use to play a game");

        }
    }
