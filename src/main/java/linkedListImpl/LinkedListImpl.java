package linkedListImpl;

public class LinkedListImpl<T> {

    private NodeImpl first;
    private NodeImpl last;
    private int counter = 0;


    public LinkedListImpl() {}

    public void add(T value) {
        NodeImpl node = new NodeImpl(value, null);
        if(counter == 0) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
        counter++;
    }

    public void add(T value, int index) {
        NodeImpl node = new NodeImpl(value, null);

    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        if (first != null) {
            toString(string, first);
        }
        string.append("]");
        return string.toString();
    }

    private void toString(StringBuilder string, NodeImpl<T> node) {
        string.append(node.toString());
        if (node.getNext() != null) {
            string.append(",");
            toString(string, node.getNext());
        }
    }
}
