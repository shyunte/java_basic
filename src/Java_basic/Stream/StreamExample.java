package Java_basic.Stream;

import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) throws Exception{

        Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
        Stream<String> streams = Files.lines((path), Charset.defaultCharset());
        streams.forEach(line -> System.out.println(line));
        streams.close();

        Set<String> set = new HashSet<>();
        set.add("손정완");
        set.add("권용수");
        set.add("남건우");
        set.add("김금빛");

        //외부 반복자

        for (String item : set){
            System.out.println(item);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }

    //내부 반복자
    Stream<String> stream = set.stream();
    stream.forEach((item) -> System.out.println(item));    // 람다식으로 처리

    }
}


