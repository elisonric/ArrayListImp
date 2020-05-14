package queueLinkedListImpl;

import linkedListImpl.NodeImpl;

public class QueueLinkedListImpl<T> {

    private NodeImpl<T> first = null;
    private NodeImpl<T> last = null;
    public int length = 0;

    public void insert(T value) {
        NodeImpl<T> node = new NodeImpl<T>(value, null);
        if (isEmpty()) {
            this.first = node;
            this.last = node;
        } else {
            NodeImpl<T> oldLast = this.last;
            this.last = node;
            oldLast.setNext(node);
        }
        length++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia, nada a ser removido!");
        }
        NodeImpl<T> oldFirst = this.first;
        this.first = this.first.getNext();
        length--;
        return oldFirst.getValue();
    }

    public boolean isEmpty(){
        return this.first == null && this.last == null;
    }

}
