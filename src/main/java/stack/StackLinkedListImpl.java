package stack;

import linkedListImpl.NodeImpl;

public class StackLinkedListImpl<T> {

    private NodeImpl<T> top = null;
    int topIndex;

    public StackLinkedListImpl() {
        topIndex = -1;
    }

    public void push(T value) {
        NodeImpl<T> node = new NodeImpl<T>(value, null);
        topIndex++;
        if (top == null) {
            this.top = node;
        } else {
            node.setNext(this.top);
            this.top = node;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        NodeImpl<T> lastTop = this.top;
        this.top = lastTop.getNext();
        topIndex--;
        return lastTop.getValue();
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return this.top.getValue();
    }
}
