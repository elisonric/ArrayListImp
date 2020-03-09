package arrayListImp;

import java.util.Objects;
import java.util.stream.Stream;

public class ArrayListImp <T> {

    private Object[] vector;
    private int counter;
    private int initialCapacity = 10;
    private boolean resize = true;
    @SuppressWarnings("FieldCanBeLocal")
    private int resizeSize = 5;

    public ArrayListImp() {
        this.vector = new Object[10];
    }

    public ArrayListImp(int size) {
        this.vector = new Object[size];
        this.initialCapacity = counter;
    }

    public ArrayListImp(int size, boolean resize) {
        this.initialCapacity = size;
        this.resize = resize;
        this.vector = new Object[counter];
    }

    public void add(T value) {
        resizeVector();
        this.vector[counter] = value;
        this.counter++;
    }

    public void add(int index, T value) {
        if (index <= counter) {
            resizeVector();

            if (Objects.isNull(this.vector[index])) {
                this.vector[index] = value;
                this.counter++;
            } else {
                //noinspection unchecked
                add(index+1, (T) this.vector[index]);
                this.vector[index] = value;
            }

        } else {
            throw new ArrayIndexOutOfBoundsException("holy shit! stop shitting");
        }
    }

    public T get(int index) {
        //noinspection unchecked
        return (T) this.vector[index];
    }

    public void clear() {
        this.vector = new Object[this.initialCapacity];
        this.counter = 0;
    }

    public int size() {
        return this.counter;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean isFull() {
        if (!this.resize) {
            return this.counter -1 == this.vector.length;
        }
        return false;
    }

    @SuppressWarnings("WeakerAccess")
    public void remove(int index) {
        if (index < this.size() && index > 0) {
            if (Objects.nonNull(get(index))) {
                relocateToLeft(index);
            }
        } else {
            throw new IndexOutOfBoundsException("Parameter index is invalid!");
        }
    }

    public boolean removeFirst(T value) {
        int index = indexOf(value);
        if (index != -1) {
            remove(index);
            return true;
        } else {
            return false;
        }
    }

    public int indexOf(T value) {
        if (value == null) {
            for (int i = 0; i < this.size(); i++)
                if (this.vector[i]==null) {
                    return i;
                }
        } else {
            for (int i = 0; i < this.size(); i++)
                if (value.equals(this.vector[i]))
                    return i;
        }
        return -1;
    }
    public int lastIndexOf(T value) {
        if (value == null) {
            for (int i = 0; i > this.size(); i--)
                if (this.vector[i]==null) {
                    return i;
                }
        } else {
            for (int i = 0; i > this.size(); i--)
                if (value.equals(this.vector[i]))
                    return i;
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    public T set(int index, T value) {
        if (index < this.size() && index > 0) {
            T lastValue = get(index);
            this.vector[index] = value;
            return lastValue;
        } else {
            throw new ArrayIndexOutOfBoundsException("Index is invalid!");
        }
    }

    public T[] toArray() {
        //noinspection unchecked,Convert2MethodRef
        return (T[]) Stream.of(this.vector)
                .filter(x -> x != null)
                .toArray();
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        String comma = "";
        string.append("[");
        for (Object e: this.vector) {
            if (Objects.nonNull(e)) {
                string.append(comma);
                comma = ",";
                string.append(e);
            }
        }
        string.append("]");
        return string.toString();
    }
    private void resizeVector() {
        if (counter >= this.vector.length) {
            if (this.resize) {
                Object[] aux = new Object[counter + this.resizeSize];
                System.arraycopy(this.vector, 0, aux,0, Math.min( this.vector.length, aux.length));
                this.vector = aux;
            } else {
                throw new ArrayIndexOutOfBoundsException("Exceeded vector size, parameter resize is false");
            }
        }
    }

    private void relocateToLeft(int index) {
        Object lastValue = null;
        for (int i = size()-1; i >= index; i--) {
            if (Objects.nonNull(this.get(i))) {
                if (Objects.isNull(lastValue)) {
                    lastValue = this.vector[i];
                    this.vector[i] = null;
                } else {
                    Object aux = lastValue;
                    lastValue = this.vector[i];
                    this.vector[i] = aux;
                }
            }
        }
    }
}
