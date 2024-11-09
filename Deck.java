package Week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	
	/*
	 * The `Deck` class represents a standard deck of 52 playing cards.
	 * The constructor initializes the `cards` list and populates it with cards by iterating through 
	 * all suits and values. It combines each value with a suit to create a unique card name.
	 * The value for each card is represented by an integer starting from 2 for "2" up to 14 for "Ace".
	 * The `shuffle()` method uses the `Collections.shuffle()` method to randomly reorder the cards in the
	 * deck. The `draw()` method removes and returns the top card from the deck, simulating a player drawing
	 * a card.
	 */

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        for (String suit : suits) {
            for (int i = 0; i < values.length; i++) {
                cards.add(new Card(i + 2, values[i] + " of " + suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}


