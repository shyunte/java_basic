package Java_basic.Optional;

import java.util.ArrayList;
import java.util.List;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /*
        double avg = list.stream()
                .mapToInt(Integer::intValue).average().getAsDouble();

         */

        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println( a));
    }
}
