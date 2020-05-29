package hanoi;

import stack.StackLinkedListImpl;

import java.util.Scanner;

public class Hanoi {

    private int size;
    private String resultGame;
    private StackLinkedListImpl leftStack;
    private StackLinkedListImpl middleStack;
    private StackLinkedListImpl rightStack;
    Scanner sc = new Scanner(System.in);

    public Hanoi() {
        this.size = 5;
        this.leftStack = new StackLinkedListImpl<Integer>();
        this.middleStack = new StackLinkedListImpl<Integer>();
        this.rightStack = new StackLinkedListImpl<Integer>();

        calculateResultGame();
        createHanoi(size);
        play();
    }

    private void calculateResultGame() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        for (int i = 1; i < this.size; i++) {
            string.append(i);
        }
        string.append("]");
        this.resultGame = string.toString();
    }

    private void createHanoi(Integer size) {
        for (int i = size; i > 0; i--) {
            leftStack.push(i);
        }
    }

    private void play() {
        do {
            menu();
        } while (!checkCompletion());
        showTowers();
        System.out.println("Parabens você conseguiu!");
    }

    private void menu() {
        showTowers();
        System.out.println("Escolha a origem e destino para mover as pedras (1,2,3), Sem que sejam iguais!");
        int origin;
        int destiny;
        do {
            System.out.println("Origem: ");
            origin = this.sc.nextInt();
        } while (origin != 1 && origin != 2 && origin != 3);

        do {
            System.out.println("Destino: ");
            destiny = this.sc.nextInt();
        } while (destiny != 1 && destiny != 2 && destiny != 3 && destiny != origin);
        move(TowersEnum.getTowerByCode(origin), TowersEnum.getTowerByCode(destiny));
    }

    private void move(TowersEnum origin, TowersEnum destiny) {
        StackLinkedListImpl originStack = null;
        StackLinkedListImpl destinyStack = null;
        if (origin.getValue() == TowersEnum.LEFTSTACk.getValue()) {
            originStack = leftStack;
        } else if (origin.getValue() == TowersEnum.MIDDLESTACK.getValue()) {
            originStack = middleStack;
        } else if (origin.getValue() == TowersEnum.RIGHTSTACK.getValue()) {
            originStack = rightStack;
        }

        if (destiny.getValue() == TowersEnum.LEFTSTACk.getValue()) {
            destinyStack = leftStack;
        } else if (destiny.getValue() == TowersEnum.MIDDLESTACK.getValue()) {
            destinyStack = middleStack;
        } else if (destiny.getValue() == TowersEnum.RIGHTSTACK.getValue()) {
            destinyStack = rightStack;
        }

        if (!originStack.isEmpty()) {
            if (destinyStack.isEmpty() || (int) originStack.top() < (int) destinyStack.top()) {
                destinyStack.push((int)originStack.pop());
            } else {
                System.out.println("erro o disco que esta tentando mover é maior que o que ja tem na pilha destino!");
                menu();
            }
        } else {
            System.out.println("erro de pilha vazia! selecione novamente");
            menu();
        }
    }

    private boolean checkCompletion() {
        return this.rightStack.topIndex == 4 && this.rightStack.toString().equals(this.resultGame);
    }

    private void showTowers() {
        StringBuilder towers = new StringBuilder();
        for (int i = 0; i < 5; i++) {
                towers.append(leftStack.get(i) == null ? " | " : (int)leftStack.get(i));
                towers.append(middleStack.get(i) == null ? " | " : (int)middleStack.get(i));
                towers.append(rightStack.get(i) == null ? " | " : (int)rightStack.get(i));
                towers.append("\n");
        }
        System.out.println();
        System.out.println(towers);
        System.out.println("===================================");
    }

    private String createDisc(int number) {
        StringBuilder disc = new StringBuilder();
        for (int i = 0; i < number; i++) {
            disc.append("-");
        }
        return disc.toString();
    }
}

