/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;

import com.sun.source.tree.ModifiersTree;

/**
 *
 * @author mehak
 */
public class D10_FabinocciSeries 
{    
  static D10_FabinocciSeries dd= new D10_FabinocciSeries();
    public static void main(String[] args)
    {
        int first=0, second=1,n=11,r;
        r=dd.rec(first,second,n);
        
//        System.out.println(r);
    }   
    
    
    int rec(int first, int second, int n)
    {
        int result;
        
        if(n>0)
        {
         
      
        result= first+second;
        first=second;
        second= result;
        System.out.println(result);

        
        return rec(first, second, n-1);
        
        }
        else
        {
            return 1;
        }
       
        
    }
}