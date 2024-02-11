import list.core.GBList;
import list.core.imple.GBArrayList;
import list.core.imple.GBLinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();

        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());

        GBLinkedList<String> linkedList = new GBLinkedList<>();

        linkedList.addFirst("a");
        linkedList.addFirst("b");
        linkedList.addLast("c");
        linkedList.addLast("d");


        System.out.println(linkedList.getElemIndex(2));
        System.out.println(linkedList.size());

        for(String s : linkedList) {
            System.out.print(s);
        }
        System.out.println();

        Iterator iterator = linkedList.descIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }

    }
}