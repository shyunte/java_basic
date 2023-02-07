package Java_basic.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("권용수", 80);
        map.put("손정완", 100);
        map.put("권용수", 90);
        map.put("송영진", 85);
        map.put("한진탁", 92);
        System.out.println("총 entry 수 : " + map.size());
        System.out.println();


        //키로 값 얻기
        String key = "권용수";
        int value = map.get(key);
        System.out.println(key + ": " + map.get("권용수"));
        System.out.println();
        
        
   /*     //키 set 컬렉션을 얻고 ,반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ":" + v);
        }
        System.out.println();
    } */
        //엔트리 Set 컬렉션을 얻고 반복새허 키와 값 얻기
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ":" + v);
        }
        System.out.println();

        map.remove("권용수");
        System.out.println("총 Entry 수  :" + map.size()  );
        System.out.println();
    }
}