package hanoi;

import stack.StackLinkedListImpl;

public class Hanoi {

    private int size;
    private StackLinkedListImpl leftStack;
    private StackLinkedListImpl middleStack;
    private StackLinkedListImpl rightStack;

    public Hanoi(int size) {
        this.size = size;
        this.leftStack = new StackLinkedListImpl<Integer>();
        this.middleStack = new StackLinkedListImpl<Integer>();
        this.rightStack = new StackLinkedListImpl<Integer>();

        createHanoi(size);
        play();
    }

    private void createHanoi(Integer size) {
        for (int i = size; i > 0; i--) {
            leftStack.push(i);
        }
    }

    public void move(TowersEnum origin, TowersEnum destiny) {
        switch (origin.name()) {
            case(TowersEnum.LEFTSTACk.name()):


        }

    }

    private void play() {
        do {

        } while (checkCompletion());
    }

    private boolean checkCompletion() {
        if (this.rightStack.topIndex == 4 && this.rightStack.top().equals(1) && ) {
            return true;
        }
        return false;
    }
}

