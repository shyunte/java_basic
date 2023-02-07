package Java_basic.Ex_Generic;

public class Course {

    //리턴타입이나 매게변수에서는 wildcardGeneric 사용가능함
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함") ;
    }

    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함") ;
    }

    public static void registerCourse3(Applicant<? extends Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함") ;
    }

}
