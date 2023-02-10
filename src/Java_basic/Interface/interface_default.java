package Java_basic.Interface;

public interface interface_default {

    //디폴트 메소드

    default  void defaultMethod1(){
        System.out.println("defualtMethod 단독 코드");
        defaultCommon();
    }

    default  void defaultMethod2(){
        System.out.println("defualtMethod2 단독 코드");
        defaultCommon();
    }

    // 메서드 2개가 999개는 내용이 같고 1개만 틀릴때 private 메서드 하나를넣어서 간소화
    private void defaultCommon(){
        System.out.println("defualtMethod 종속 코드3");
        System.out.println("defualtMethod2 종속 코드4");

    }



    static void staticMethod1(){
        System.out.println("staticMethod 단독 코드");
        staticCommon();

    }

    static void staticMethod2(){
        System.out.println("staticMethod 종속 코드2");
        staticCommon();

    }


    private static void staticCommon(){
        System.out.println("statictMethod 종속 코드3");
        System.out.println("statictMethod 종속 코드4");
    }


}
