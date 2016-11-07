/**
 * Created by Owner on 11/6/16.
 */
public class Card {

    private String rank;      // 2-10, j, q, k, a
    private String suit;    // hears, clubs, diamonds, spades
    private int value;      // numeric value of rank


    public Card(String r, String s, int val) {

        this.rank = r;
        this.suit = s;
        this.value = val;
    }

    public String getRank() {

        return rank;
    }

    public void setRank(char r) {

        value = r;
    }

    public String getSuit() {

        return suit;
    }

    public void setSuit(String s) {

        suit = s;
    }

    public int getValue() {

        return value;
    }

    public void setValue(int val) {

        value = val;
    }

    @Override
    public String toString() {

        return ("Rank " + this.getRank() + " Suit " + this.getSuit());

    }
}
