package Java_basic.Lambda3;

public class MethodReferenceExample {
    public static void main(String[] args) {

        Person person = new Person();

        //정적 메소드일 경우
        //메소드 참조
        person.action(Computer::staticMethod);    //peson.action((x,y )  -> Computer.staticMethod(x,y));

        //인스턴스 메소드

        Computer com = new Computer();
        person.action(com::instanceMethod);
    }
}
