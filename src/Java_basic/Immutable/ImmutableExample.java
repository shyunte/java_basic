package Java_basic.Immutable;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        //list 불변 컬랙션 생성
        List<String> immutableList1 = List.of("A", "B", "C");

        //Set 불변 컬랙션 생성
        Set<String> immutableSet1 = Set.of("A", "B", "C");
        
        //map 불변 컬랙션 생성
        Map<Integer, String> immmutableMap1 = Map.of(
                1,"A",
                2,"B",
                3,"C"
        );

        
        
        //List 컬렉션을 불변 컬렉션으로 복사
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);
        
        
        //Set  컬렉션을 불변 컬렉션으로 복사
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);
        
        
        //Map 컬렉션을 불변 컬렉션으로 복사
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(1, "B");
        map.put(1, "C");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);
        
        
        //배열로부터 list 불변 컬렉션 생성
        String[] arr = { "A", "B", "C"};
        List<String> immutableList3 = Arrays.asList(arr);
    }
}
