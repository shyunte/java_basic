package Java_basic.LambdaCompare;

public class Person {
    public void ordering(Comparable comparable){
        
    String a = "손정완";
    String b = "왕정완";

    int result = comparable.compare(a, b);
    
    if(result <0){
        System.out.println(a+"보다 "+b +" 앞에 있음");
    }else if (result ==0){
        System.out.println(a+ "와 "+b +" 같음");
    }else{
        
        System.out.println(a+"는 "+b +" 보다 뒤에 있음");
    }
    }
}
