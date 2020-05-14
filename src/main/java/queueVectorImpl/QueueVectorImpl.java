package queueVectorImpl;

public class QueueVectorImpl {

    private Object[] vector;
    private int first;
    private int last;
    public int length;


    public QueueVectorImpl(int length) {
        this.vector = new Object[length];
        this.first = 0;
        this.last = 0;
        this.length = 0;
    }

    public void insert(Object o) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia, não há espaço para inserir!");
        }
        this.vector[last] = o;
        last = (last + 1) % vector.length;
        length++;
    }

    public Object remove() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia, nada a ser removido!");
        }
        Object element = this.vector[first];
        first = (first +1) % vector.length;
        length--;
        return element;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public boolean isFull() {
        return length == vector.length;
    }
}
