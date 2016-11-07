/**
 * Created by Owner on 11/6/16.
 */
import java.util.*;

public class Deck {

    static ArrayList<Card> deck;

    public Deck() {

        deck = new ArrayList<Card>();
    }

    public static void fillDeck() {

        deck.add(new Card("2", "hearts", 2));
        deck.add(new Card("3", "hearts", 3));
        deck.add(new Card("4", "hearts", 4));
        deck.add(new Card("5", "hearts", 5));
        deck.add(new Card("6", "hearts", 6));
        deck.add(new Card("7", "hearts", 7));
        deck.add(new Card("8", "hearts", 8));
        deck.add(new Card("9", "hearts", 9));
        deck.add(new Card("10", "hearts", 10));
        deck.add(new Card("J", "hearts", 11));
        deck.add(new Card("Q", "hearts", 12));
        deck.add(new Card("K", "hearts", 13));
        deck.add(new Card("A", "hearts", 14));

        deck.add(new Card("2", "diamonds", 2));
        deck.add(new Card("3", "diamonds", 3));
        deck.add(new Card("4", "diamonds", 4));
        deck.add(new Card("5", "diamonds", 5));
        deck.add(new Card("6", "diamonds", 6));
        deck.add(new Card("7", "diamonds", 7));
        deck.add(new Card("8", "diamonds", 8));
        deck.add(new Card("9", "diamonds", 9));
        deck.add(new Card("10", "diamonds", 10));
        deck.add(new Card("J", "diamonds", 11));
        deck.add(new Card("Q", "diamonds", 12));
        deck.add(new Card("K", "diamonds", 13));
        deck.add(new Card("A", "diamonds", 14));

        deck.add(new Card("2", "clubs", 2));
        deck.add(new Card("3", "clubs", 3));
        deck.add(new Card("4", "clubs", 4));
        deck.add(new Card("5", "clubs", 5));
        deck.add(new Card("6", "clubs", 6));
        deck.add(new Card("7", "clubs", 7));
        deck.add(new Card("8", "clubs", 8));
        deck.add(new Card("9", "clubs", 9));
        deck.add(new Card("10", "clubs", 10));
        deck.add(new Card("J", "clubs", 11));
        deck.add(new Card("Q", "clubs", 12));
        deck.add(new Card("K", "clubs", 13));
        deck.add(new Card("A", "clubs", 14));

        deck.add(new Card("2", "spades", 2));
        deck.add(new Card("3", "spades", 3));
        deck.add(new Card("4", "spades", 4));
        deck.add(new Card("5", "spades", 5));
        deck.add(new Card("6", "spades", 6));
        deck.add(new Card("7", "spades", 7));
        deck.add(new Card("8", "spades", 8));
        deck.add(new Card("9", "spades", 9));
        deck.add(new Card("10", "spades", 10));
        deck.add(new Card("J", "spades", 11));
        deck.add(new Card("Q", "spades", 12));
        deck.add(new Card("K", "spades", 13));
        deck.add(new Card("A", "spades", 14));

    //   System.out.println("deck size is " + deck.size());
    //   System.out.println(deck);
    }

    public void shuffleDeck() {

        Collections.shuffle(deck);
        Collections.shuffle(deck);
        Collections.shuffle(deck);
        Collections.shuffle(deck);
        Collections.shuffle(deck);
        System.out.println("shuffled deck " + deck);
    }
/*
    public void dealDeck() {

        for(int i = 0; i < 26; i++) {
           Player.hand.add(deck.get(i));
        }
    }
*/
}
