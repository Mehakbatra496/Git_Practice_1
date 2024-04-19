/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

/**
 *
 * @author mehak
 */
public class A3_StringBuffer {
    public static void main(String[] args) {
        
         String name="Prashant";
        name.concat("java");   //Cannot concatenate as it is immutable
        System.out.println(name);

        
        StringBuffer st=new StringBuffer("Mehak");
        
        st.append("Batra");// it is not immutable hence can append
        System.out.println(st); 
        System.out.println(st.toString());    
        
        System.out.print("String Builder..............................");
        StringBuilder sb=new StringBuilder("Kawan");
//        sb.getClass();
        System.out.println(sb.capacity());
                
    }
}