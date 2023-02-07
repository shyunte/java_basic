package Java_basic.basic;

public class overFlowunderFlow {
    public static void main(String[] args){

        byte value = 127;

        value++;
        System.out.println(value);
        // 결과값 -128


        byte value2 = -128;

        value2--;
        System.out.println(value);
        // 결과값 127

    }
}
