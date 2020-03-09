import arrayListImp.ArrayListImp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayListImp<Integer> array = new ArrayListImp<>(3);
        Integer i = 0;
        array.add(i++);
        array.add(i++);
        array.add(i++);
        array.add(i++);
        array.add(i++);
        array.add(1, i++);
/*
        array.remove(1);
        array.clear();
        System.out.println(array.removeFirst(4));
        System.out.println(array.set(1, 10));
*/
        System.out.println(array.indexOf(3));
        System.out.println(array.contains(4));
        System.out.println(array.isEmpty());
        System.out.println(array);
        System.out.println(array.get(1).getClass());
        System.out.println(array.size());
        System.out.println(Arrays.toString(array.toArray()));
    }
}
