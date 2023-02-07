package Java_basic.Generic;

public class GenericManual {

    /*  제네릭은 결정되지 않은 타입을 파라미터로 처리하고
        실제 사용할때 타라미터를 구체적으로 지정함
     */

    public static <T extends Number> boolean compare(T t1, T t2){

        System.out.println("compare(" +t1.getClass().getSimpleName() + "," + t2.getClass().getSimpleName()+")");
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return (v1 == v2);

    }

    public static void main(String[] args) {
        boolean result = compare(10,20);
        System.out.println(result);

        boolean result2 = compare(120/2,120/2);
        System.out.println(result2);
    }

}
