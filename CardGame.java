package ikbo.prak7;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Deque;

public class CardGame {
    private String hand;
    private Deque array;

    CardGame(String hand) {

        this.hand = hand;
        array = new LinkedList<Integer>();
        String[] game_hand = hand.split(" ");
        for (String i : game_hand) {
            array.add(Integer.parseInt(i));
        }

    }

    public int getNumber() {
        return (int)array.getFirst();
    }

    public int arraySize() {
        return array.size();
    }

    public void addNumbers(int first_card, int second_card) {
        array.addLast(first_card);
        array.addLast(second_card);
    }

    public void removeNumbers() {
        array.removeFirst();
    }

    public void print() {
        while (!array.isEmpty()) {
            System.out.println(array.remove());
        }
    }

}
