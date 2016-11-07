/**
 * Created by Owner on 11/6/16.
 */
import java.util.*;

public class Game {

    private int p1Value;
    private int p2Value;
    private boolean playing = true;
    private Card temp1;
    private Card temp2;

    public Game(Player p1, Player p2) {

        // need to check that neither of the hands is empty
        while(playing) {
            if(p1.hand.size() > 0) {
                temp1 = p1.hand.get(0);
                p1Value = temp1.getValue();
                System.out.println("Player 1 card " + temp1.getRank() + " " + temp1.getSuit());
                p1.hand.remove(0);
                Collections.shuffle(p1.hand);
            } else {
                System.out.println("Player 2 wins");
                playing = false;
            }

            if(p2.hand.size() > 0) {
                temp2 = p2.hand.get(0);
                p2Value = temp2.getValue();
                System.out.println("Player 2 card " + temp2.getRank() + " " + temp2.getSuit());
                p2.hand.remove(0);
                Collections.shuffle(p2.hand);
            } else {
                System.out.println("Player 1 wins");
                playing = false;
            }

            if (p1Value > p2Value) {
                p1.hand.add(temp1);
                p1.hand.add(temp2);
                System.out.println("Player 1 wins hand");
            //    System.out.println(p1.hand.size() + " " + p1.hand);
            //    System.out.println(p2.hand.size() + " " + p2.hand);
                System.out.println("Player 1 cards remaining " + p1.hand.size());
                System.out.println("Player 2 cards remaining " + p2.hand.size());
            } else if (p1Value < p2Value) {
                p2.hand.add(temp1);
                p2.hand.add(temp2);
                System.out.println("Player 2 wins hand");
            //    System.out.println(p1.hand.size() + " " + p1.hand);
            //    System.out.println(p2.hand.size() + " " + p2.hand);
                System.out.println("Player 1 cards remaining " + p1.hand.size());
                System.out.println("Player 2 cards remaining " + p2.hand.size());
            } else {
                // tie, move on
                System.out.println("hand is a tie");
                p1.hand.add(temp1);
                p2.hand.add(temp2);
            }

        }

    }
}
