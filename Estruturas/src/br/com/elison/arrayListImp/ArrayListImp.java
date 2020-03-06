package br.com.elison.arrayListImp;

import java.util.Objects;

public class ArrayListImp {

    Integer vector [];
    int counter;
    int initialCacity = 10;
    boolean resize = true;
    int resizeSize = 5;

    public ArrayListImp() {
        this.vector = new Integer[10];
    }

    public ArrayListImp(int size) {
        this.vector = new Integer[size];
        this.initialCacity = counter;
    }

    public ArrayListImp(int size, boolean resize) {
        this.initialCacity = size;
        this.resize = resize;
        this.vector = new Integer[counter];
    }

    public void add(Integer value) {
        resizeVector();
        this.vector[counter] = value;
        this.counter++;
    }

    public void add(int index, Integer value) {
        if (index <= counter) {
            resizeVector();

            if (Objects.isNull(this.vector[index])) {
                this.vector[index] = value;
                this.counter++;
            } else {
                add(index+1, this.vector[index]);
                this.vector[index] = value;
            }

        } else {
            throw new ArrayIndexOutOfBoundsException("holy shit! stop shitting");
        }
    }

    public Integer get(int index) {
        return this.vector[index];
    }

    private void resizeVector() {
        if (counter >= this.vector.length) {
            if (this.resize) {
                Integer aux[] = new Integer[counter + this.resizeSize];
                System.arraycopy(this.vector, 0, aux,0, Math.min( this.vector.length, aux.length));
                this.vector = aux;
            } else {
                throw new ArrayIndexOutOfBoundsException("Exceeded vector size, parameter resize is false");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        String comma = "";
        string.append("[");
        for (Integer e: this.vector) {
            if (Objects.nonNull(e)) {
                string.append(comma);
                comma = ",";
                string.append(e);
            }
        }
        string.append("]");
        return string.toString();
    }
}
