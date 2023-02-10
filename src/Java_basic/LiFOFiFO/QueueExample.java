package Java_basic.LiFOFiFO;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<QueMessage> messageQueue = new LinkedList<>();


        messageQueue.offer(new QueMessage("sendMail", "홍길동"));
        messageQueue.offer(new QueMessage("sendSMS", "박길동"));


        while(!messageQueue.isEmpty()){
            QueMessage message = messageQueue.poll();
            switch (message.command){
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 발송");
                    break;
                case "sendSMS" :
                    System.out.println(message.to + "님에게 메일을 발송");
                    break;
            }
        }
    }
}
