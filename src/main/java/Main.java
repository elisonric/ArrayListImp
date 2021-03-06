import stack.StackLinkedListImpl;
import stack.StackVectorImpl;

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

//        LinkedListImpl<Carro> a = new LinkedListImpl<>();
//        a.add(new Carro("Hb20", 2020));
//        a.add(new Carro("Celta", 2019));
//        a.add(new Carro("Gol", 2010));
//        a.add(new Carro("Fit", 2015), 2);
//        System.out.println(a.toString());
//
//        System.out.println(a.isEmpty());
//        System.out.println(a.size());
////        a.clear();
////        System.out.println(a.remove(1));
////        System.out.println(a.removeFirst(new Carro("Celta", 2019)));
//
//        System.out.println(a.indexOf(new Carro("Celta", 2019)));
//        System.out.println(a.lastIndexOf(new Carro("Celta", 2019)));
//        System.out.println("AFTER-------------------");
//        System.out.println(a.toString());
//
//        a.toArray();

//        FilaVectorImpl a = new FilaVectorImpl(4);
//        a.insert(1);
//        a.insert(2);
//        a.insert(3);
//        a.insert(4);
//        System.out.println(a.remove());
//        a.insert(5);
//        System.out.println(a.remove());

//        QueueLinkedListImpl a = new QueueLinkedListImpl<Integer>();
//        a.insert(1);
//        a.insert(2);
//        a.insert(3);
//        a.insert(4);
//        System.out.println(a.remove());
//        a.insert(5);
//        System.out.println(a.remove());


//        StackVectorImpl p = new StackVectorImpl();
//
//        p.push(5);
//        p.push(4);
//        p.push(3);
//        p.push(2);
//        p.push(1);
//
//        while (!p.isEmpty()) {
//            System.out.println(p.pop());
//        }

        StackLinkedListImpl<Integer> p = new StackLinkedListImpl<Integer>();

        p.push(5);
        p.push(4);
        p.push(3);
        p.push(2);
        p.push(1);

        while (!p.isEmpty()) {
            System.out.println(p.pop());
        }
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
