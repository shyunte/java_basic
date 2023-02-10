package Java_basic.Thread;

import java.awt.*;

public class BeepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i<5; i++){
            toolkit.beep();
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
        
        //작업 2 // 순서대로함
        for (int i= 0; i<5; i++){
            System.out.println("띵~~");
            try{
                Thread.sleep(500);
            }catch ( InterruptedException e ){}
        }
    }
}
