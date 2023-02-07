package Java_basic.basic;

public class Accuracy {
    public static void main(String[] args){

        //정수 연산에서 부동소수점 문제점
        int apple2 = 1;
        double totalpieces2 = 0.1;
        int number2 = 7;

        double result2 = apple2 -number2 * totalpieces2;
        System.out.println("사과 1개에서 남은양 " + result2/10.0);



        //올바른 예
        int apple = 1;
        int totalpieces = apple * 10;
        int number = 7;

        int result = totalpieces - number;
        System.out.println("10조각에서 남은 조각" + result);
        System.out.println("사과 1개에서 남은양 " + result/10.0);
    }
}
