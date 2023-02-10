package Java_basic.Lambda2;

public class lambdaExample {

    public static void main(String[] args) {
        Person person = new Person();


        //매게변수가 두개일 경우
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

            //Return 생략
        person.action((x, y) -> x + y);



        person.action((x, y) -> {
            return sum(x, y);
        });

    }

    public static  double sum( double x , double y){
        return (x + y);
    }
}
