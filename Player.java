package Week6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	/*
	 * The `Player` class represents a player in the card game with a hand of cards, a score, and a name.
	 * The constructor initializes the player's name, creates an empty list for their hand, and sets their
	 * score to 0. The `getName()` and `setName()` methods allow access and modification of the player's name.
	 * The `describe()` method prints the player's name and then iterates through their hand, calling the
	 * `describe()` method on each card to display their cards.The `flip()` method removes and returns the top
	 * card from the player's hand, simulating the action of playing a card. The `draw()` method takes a
	 * `Deck` as an argument and draws a card from the deck, adding it to the player's hand. The
	 * `incrementScore()` method adds 1 to the player's score each time they win a round. The `getScore()`
	 *  method returns the player's current score.
	 */

	
	private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        return hand.remove(0);
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}





