import java.util.ArrayList;

/**
 * Created by Owner on 11/6/16.
 */
public class Main {

    public static void main(String args[]) {

        // create 52 cards
        // add to deck
        // shuffle deck

        Deck deck = new Deck();
        deck.fillDeck();
        deck.shuffleDeck();

        // replace with ask for number of players so these 2 lines won't be needed

        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");

        // deal to each player

       if(Player.numPlayers == 2) {
            p1.hand = new ArrayList<Card>(Deck.deck.subList(0, 26));
            System.out.println(p1.hand.size() + " Player 1's hand " + p1.hand);
            p2.hand = new ArrayList<Card>(Deck.deck.subList(26, 52));
            System.out.println(p2.hand.size() + " Player 2's hand " + p2.hand);
        }



        Game game = new Game(p1,p2);

    }
}
