package Java_basic.Mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("손정완", 65));
        studentList.add(new Student("손정완", 75));
        studentList.add(new Student("손정완", 25));


        //Student를 score 스트림으로 변환

        studentList.stream()
                .mapToInt(s -> s.getScore())
                .forEach(score -> System.out.println(score));


        List<String> list2 = Arrays.asList("10,20,30", "40,50");

        list2.stream()
                .flatMapToInt(data -> {
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                    return Arrays.stream(intArr);
                })
                .forEach(number -> System.out.println(number));

        int[] arr = {1, 2, 3};

        boolean result = Arrays.stream(arr)
                .anyMatch(a -> a % 2 == 0);
        System.out.println(result);


    }
}
