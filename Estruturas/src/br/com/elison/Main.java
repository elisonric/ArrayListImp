package br.com.elison;

import br.com.elison.arrayListImp.ArrayListImp;



public class Main {
    public static void main(String[] args) {

        ArrayListImp array = new ArrayListImp(3, false);
        Integer i = 0;
        array.add(i++);
        array.add(i++);
        array.add(i++);
        array.add(i++);
        array.add(i++);
        array.add(1, i++);
        System.out.println(array);
    }
}
