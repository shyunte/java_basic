package Java_basic.Generic;


import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {

        //정상코드
        /*
        FruitBox2 appleBox = new FruitBox2(new Apple());
        FruitBox2 bananaBox = new FruitBox2(new Banana());

        Apple apple = (Apple) appleBox.getFruit();
        Banana banana = (Banana) bananaBox.getFruit();
        */


        //에러코드 (런타임 에러가 발생함)
        /*
        FruitBox2 appleBox2 = new FruitBox2(new Apple());
        FruitBox2 bananaBox2 = new FruitBox2(new Banana());

        Apple apple = (Apple) appleBox2.getFruit();
        Banana banana = (Banana) appleBox.getFruit();

         */

        FruitBox<Apple> appleBox = new FruitBox<>(new Apple());
        FruitBox<Banana> bananaBox = new FruitBox<>(new Banana());

            Apple apple = appleBox.getFruit();
        /*  Banana banana = appleBox.getFruit(); */    //이런식으로 컴파일 에러를 발생킴. 런타임에러보다 수정이 수월함

        //컴파일 타임에 자료형 오류에 대한 검증을 수행하여 런타임 자료형에 안전한 코드를 실생함
        //반환값에 대한 타입변환 및 타입 검사에 들어가는 노력을 줄임, 형변환이 없어져 가독성이 좋음


    }
}

//클래스나 메소드에서 사용할 내부 데이터 타입을 외부에서 지정하는 기법
class FruitBox<T> {

    List<T> fruits = new ArrayList<>();

    private T fruit;

    public FruitBox(T fruit) {
        fruits.add(fruit);

    }

    public T getFruit() {

        return fruit;
    }
}


class Apple {
}

class Banana {
}

class FruitBox2 {
    private Object fruit;

    public FruitBox2(Object fruit) {
        this.fruit = fruit;
    }

    public Object getFruit() {
        return fruit;
    }
}
