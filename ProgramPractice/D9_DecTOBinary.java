/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programpractice;
public class D9_DecTOBinary 
{

    public static void main(String[] args)
    {
            int num=23,rem, rem2, num3=32;
            
            String result;
            String st= "";
            int arr[]= new int[32];
            int count = 0;
            
            while(num!=0)
            {
                rem=num%2;
                st=rem+st;
                num=num/2;
            }
            System.out.println(st);        //by storing it into a string    

            int num2=23;
            
            while(num2!=0)                
            {
                
                rem2= num2%2;
                arr[count]=rem2;
                count=count+1;
                num2=num2/2;
                
            }
            
            System.out.println(count);
            for(int i=count-1; i>=0; i--)
            {
                System.out.print(arr[i]);   // by storing into an array
            }
            
            
            System.out.println("");
            result= Integer.toBinaryString(num3);
            
            System.out.println(result);
            
            
    }
   
}
