package Java_basic.SetColloection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        Iterator<String> iterator = set.iterator();

        set.add("JAVA");
        set.add("SPRING");
        set.add("JSP");
        set.add("JDBC");
        
        
        //객체를 하나씩 가져오기
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("SPRING")) {
                //가져온 객체 삭제
                iterator.remove();
            }
        }

        System.out.println();

        set.remove("JSP");

        for(String element : set){
            System.out.println(element);
        }


    }
}
