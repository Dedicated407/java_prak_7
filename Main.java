package ikbo.prak7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CardGame player_1 = new CardGame(scan.nextLine());
        CardGame player_2 = new CardGame(scan.nextLine());
        int count = 0;

        while (player_1.arraySize() != 0 && player_2.arraySize() != 0) {
            if (player_1.getNumber() == 0 && player_2.getNumber() == 9 || player_1.getNumber() == 9 && player_2.getNumber() == 0)
                if (player_1.getNumber() == 0)
                    player_1.addNumbers(player_1.getNumber(), player_2.getNumber());
                else
                    player_2.addNumbers(player_1.getNumber(), player_2.getNumber());
            else
                if (player_1.getNumber() > player_2.getNumber())
                    player_1.addNumbers(player_1.getNumber(), player_2.getNumber());
                else
                    player_2.addNumbers(player_1.getNumber(), player_2.getNumber());

                if (count == 106) {
                    System.out.println("botva");
                    break;
                }

            player_1.removeNumbers();
            player_2.removeNumbers();
            count++;
        }

        if (player_1.arraySize() == 0)
            System.out.println("second " + count);

        if (player_2.arraySize() == 0)
            System.out.println("first " + count);

    }
}

