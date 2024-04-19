/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

/**
 *
 * @author mehak
 */
public class A5_StringBuffer$StringBuilder {
    
    
        public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        // Creating two threads that modify the StringBuilder concurrently
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append("A");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append("B");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the final result
        System.out.println("Result with StringBuilder: " + stringBuilder.toString());
    }

}
