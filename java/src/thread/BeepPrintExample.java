package thread;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
       Thread thread = new Thread(new Runnable() {
           @Override
           public void run() {
               Toolkit toolkit = Toolkit.getDefaultToolkit();
               for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                   try {
                       Thread.sleep(500);
                   } catch (Exception e) {
                       System.out.println("e = " + e);
                   }
               }
           }
       });
       thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("e = " + e);
            }
        }
    }
}
