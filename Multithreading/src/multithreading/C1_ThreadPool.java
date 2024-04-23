/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author mehak
 */
public class C1_ThreadPool {
    
    public static void main(String[] args) {
        
        String name= Thread.currentThread().getName();
                String name2= Thread.currentThread().getThreadGroup().getName();

        System.out.println(name);
                System.out.println(name2);

    }
}
