package Java_basic.Lambda;

public class LambdaExample3 {
    public static void main(String[] args) {

        Person person = new Person();
        
        person.action1((name, job) ->{
            System.out.println("내 이름은 "+name +"이고");
            System.out.println("내 직업은 " + job +"입니다");
        });
        
        person.action2(name ->
                System.out.println(name + "좋은하루 보내셈"));
    }
}
