package Java_basic.ListCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        Thread threadA = new Thread() {

            public void run() {

                for (int i = 0; i < 1000; i++) {
                    list.add(new Board("정완" + i, "손정완" + i, "완정손" + i));
                }
            }
        };


        Thread threadB = new Thread() {
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("정완" + i, "손정완" + i, "완정손" + i));
                }
            }
        };

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {

        }
        int size = list.size();
        System.out.println("총 객체수 :" + size);
        System.out.println();
    }

}

