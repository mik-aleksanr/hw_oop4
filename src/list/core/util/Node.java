package list.core.util;

public class Node<R> {
    private R currentRec;
    private Node<R> prevRec;
    private Node<R> nextRec;

    public Node(R currentRec, Node<R> prevRec, Node<R> nextRec) {
        this.currentRec = currentRec;
        this.prevRec = prevRec;
        this.nextRec = nextRec;
    }

    public R getCurrent() {
        return currentRec;
    }

    public Node<R> getPrev() {
        return prevRec;
    }

    public Node<R> getNext() {
        return nextRec;
    }

    public void setCurrent(R currentRec) {
        this.currentRec = currentRec;
    }

    public void setPrev(Node<R> prevRec) {
        this.prevRec = prevRec;
    }

    public void setNext(Node<R> nextRec) {
        this.nextRec = nextRec;
    }


}
