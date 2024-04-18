   public class A2_Object
    {
       
    }

    class Mobile
    {
         public static void main(String[] args)
        {
            Mobile mb= new Mobile("Nokia", 23342);
            mb.fun();
        }
            String mname;
            long mid;
            public Mobile(String name, long id) 
            {
                mname=name;
                mid=id;
            }
    
            void fun()
            {
                System.out.println(mname);
                System.out.println(mid);

            }
    }