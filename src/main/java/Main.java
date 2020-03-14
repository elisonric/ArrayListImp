import arrayListImpl.ArrayListImpl;
import linkedListImpl.LinkedListImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        ArrayListImpl<Integer> array = new ArrayListImpl<>(3);
//        Integer i = 0;
//        array.add(i++);
//        array.add(i++);
//        array.add(i++);
//        array.add(i++);
//        array.add(i++);
//        array.add(1, i++);
///*
//        array.remove(1);
//        array.clear();
//        System.out.println(array.removeFirst(4));
//        System.out.println(array.set(1, 10));
//*/
//        System.out.println(array.indexOf(3));
//        System.out.println(array.contains(4));
//        System.out.println(array.isEmpty());
//        System.out.println(array);
//        System.out.println(array.get(1).getClass());
//        System.out.println(array.size());
//        System.out.println(Arrays.toString(array.toArray()));

        LinkedListImpl<Carro> a = new LinkedListImpl<>();
        a.add(new Carro("Hb20", 2020));
        a.add(new Carro("Celta", 2019));
        a.add(new Carro("Gol", 2010));
        a.add(new Carro("Fit", 2015));
        System.out.println(a.toString());
    }

    public static class Carro {
        private String modelo;
        private Integer ano;

        public Carro(String modelo, Integer ano) {
            this.modelo = modelo;
            this.ano = ano;
        }

        @Override
        public String toString() {
            return "\tCarro {\n" +
                    "\t\tmodelo='" + modelo + "\'," +
                    "\n\t\tano=" + ano +
                    "\n\t}";
        }
    }

}
