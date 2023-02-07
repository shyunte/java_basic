package Java_basic.Ex_exception;

public class Exception {
    public static void printLength(String data){
        try{
        int result = data.length();
        System.out.println("문자수 " + result);
    }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("[ 정상 종료]");
        }
        }

    public static void main(String[] args) {
        System.out.println("[ 시작 ]  ");
        printLength("javas0");
        System.out.println("[ 끄으으읕]");
    }
}
