package Java_basic.TreeSet;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 13000));
        treeSet.add(new Fruit("딸기", 3000));

        // 1객체를 하나씩 가져옴
        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + ";" + fruit.price);

        }
    }
}
