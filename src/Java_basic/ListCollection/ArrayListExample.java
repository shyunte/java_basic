package Java_basic.ListCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<Board> list = new ArrayList<>();

        list.add(new Board("제목", "내용1", "글쓴이 1"));
        list.add(new Board("제목", "내용2", "글쓴이 2"));
        list.add(new Board("제목", "내용3", "글쓴이 3"));
        list.add(new Board("제목", "내용4", "글쓴이 4"));
        list.add(new Board("제목", "내용5", "글쓴이 5"));

        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();


        //특정 인덱스 객체 가져오기
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();


        //모든 객체를 하나씩 가져오기
        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();


        list.remove(2);
        list.remove(2);

        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }
}
