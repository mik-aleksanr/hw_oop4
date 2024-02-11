package list.core;

public interface GBLinked<R> {
    void addLast(R e);

    void addFirst(R e);

    int size();

    R getElemIndex(int count);
}
