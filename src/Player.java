/**
 * Created by Owner on 11/6/16.
 */
import java.util.*;

public class Player {

    private String name;
    public ArrayList<Card> hand;
    static int numPlayers;

    public Player(String n) {

        this.name = n;
        ArrayList<Card> hand = new ArrayList<Card>();
        numPlayers++;

    }

    public ArrayList<Card> getHand() {

        return hand;
    }

    public String getName() {

        return name;
    }

}


