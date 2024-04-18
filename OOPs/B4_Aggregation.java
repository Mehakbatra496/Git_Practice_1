/**
 *
 * @author mehak
 */
public class B4_Aggregation 
{
    public static void main(String[] args) 
    {
        Customer c= new Customer("Mehak", 12324);
        Bank b= new Bank("ICICI", "hfa7");
        b.getBankCustomerDetails(c); //pass another object reference so that one object can associate with it
    }
}

    class Bank
    {
        String bname, bifsc;
        public Bank(String name, String ifsc)
        {
            bname=name;
            bifsc=ifsc;
        }
        
        void getBankCustomerDetails(Customer cs)
        {
            System.out.println("Bank and customer details are...  ");
            System.out.println(bname+" "+ bifsc);
            System.out.println(cs.aname+""+cs.aacc);
//            System.out.println(cs.aacc);
            
        }
    }

    class  Customer
    {
        String aname;
        int aacc;    
            public Customer(String name, int acc)
            {
                this.aname= name;
                this.aacc=acc;
            }
    }
