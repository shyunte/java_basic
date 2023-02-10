package Java_basic.instanceMemberClass;

public class Aexample {
    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B();

        b.methodB();

    }
}
