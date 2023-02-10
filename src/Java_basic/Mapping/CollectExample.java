package Java_basic.Mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {

        List<Student2> totalList = new ArrayList<>();
        totalList.add(new Student2("권용수", "남", 92));
        totalList.add(new Student2("김금빛", "여", 94));
        totalList.add(new Student2("남건우", "남", 96));
        totalList.add(new Student2("손정완", "남", 94));
        totalList.add(new Student2("이도희", "여", 89));


        Map<String, List<Student2>> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getSss())
                );

        List<Student2> maleList = map.get("남");
        maleList.stream().forEach(s -> System.out.println("성이 남자인 사람 : " + s.getName()));
        System.out.println();
        System.out.println();
        System.out.println();


        List<Student2> femaleList = map.get("여");
        femaleList.stream().forEach(s -> System.out.println("성이 남자인 사람 : " + s.getName()));


        Map<String, Double> map2 = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s.getSss(),
                                Collectors.averagingDouble(s -> s.getAge())
                        )
                );

        System.out.println(map2);

    }
}
