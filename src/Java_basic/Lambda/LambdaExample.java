package Java_basic.Lambda;

public class LambdaExample {
    public static void main(String[] args) {
        action((x,y) ->{
            int result = x+y;
            System.out.println("result :" + result);
        });

        action((x,y) -> {
            int result = x - y;
            System.out.println("result " +result);
        });
    }

    public static void action(Calculable calculable){   //  (매게변수란에  추상메서드 인터페이스타입이면 언제든지 람다가능)
        
        //데이터

        int x =10 ;
        int y = 4;

        //데이터처리
        calculable.calculate(x,y);
    }
}
