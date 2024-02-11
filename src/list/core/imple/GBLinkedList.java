package list.core.imple;

import list.core.GBLinked;
import list.core.DescIterator;
import list.core.util.Node;

import java.util.Iterator;

public class GBLinkedList<R> implements GBLinked<R>, Iterable<R>, DescIterator<R> {
    private Node<R> first;
    private Node<R> last;
    private int size = 0;

    public GBLinkedList() {
        last = new Node<>(null, first, null);
        first = new Node<>(null, null, last);
    }


    private Node<R> getNextRec(Node<R> current) {
        return current.getNext();
    }

    @Override
    public R getElemIndex(int count) {
        Node<R> record = first.getNext();
        for (int i = 0; i < count; i++) {
            record = getNextRec(record);
        }
        return record.getCurrent();
    }

    @Override
    public void addLast(R e) {
        Node<R> prev = last;
        prev.setCurrent(e);
        last = new Node<>(null, prev, null);
        prev.setNext(last);
        size++;
    }

    @Override
    public void addFirst(R e) {
        Node<R> next = first;
        next.setCurrent(e);
        first = new Node<>(null, null, next);
        next.setPrev(first);
        size++;
    }


    @Override
    public int size() {
        return size;
    }


    @Override
    public Iterator<R> iterator() {
        return new Iterator<>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public R next() {
                return getElemIndex(counter++);
            }
        };
    }


    @Override
    public Iterator<R> descIterator() {
        return new Iterator<>() {
            int counter = size - 1;

            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public R next() {
                return getElemIndex(counter--);
            }
        };
    }

}
