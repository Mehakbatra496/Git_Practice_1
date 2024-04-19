/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;
import java.util.StringTokenizer;
/**
 *
 * @author mehak
 */
public class A6_StringTokenizer
{
    public static void main(String[] args) {
        
            StringTokenizer st=new StringTokenizer("This is my first demo");
                
//                st.toString();
                
//                System.out.println(st.toString());
                        System.out.println(st.countTokens());            
//        StringTokenizer st= new 


//for(int i=0; i<st.countTokens(); i++)
//{
//    System.out.println(i);
//           if(st.hasMoreElements())
//           {
//               System.out.println(st.nextToken());
//           }
// }

        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        
        
        
    }
}
