package Week6;


public class App {
    public static void main(String[] args) {
    	
    	/*
    	 * The program begins by creating a `Deck` object and two `Player` objects, each representing a 
    	 * player in the game. The deck is shuffled using the `shuffle()` method to randomize the card order.
    	 * Each player draws 26 cards from the deck using the `draw()` method, which adds cards to their 
    	 * respective hands. The game then enters a loop of 26 rounds, where each player flips a card from 
    	 * their hand using the `flip()` method, which removes and returns the top card.
    	 * The values of the cards are compared using the `getValue()` method to determine 
    	 * which player has the higher card. The player with the higher card value increments their 
    	 * score using the `incrementScore()` method. If the values are the same, no score is added for that
    	 * round. After all rounds, the final scores are compared, and the player with the higher score is
    	 * declared the winner, or a draw is announced if the scores are equal.
    	 */
    	
    	Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        deck.shuffle();

        for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        for (int i = 0; i < 26; i++) {
            System.out.println("Round " + (i + 1) + ":");

            System.out.print(player1.getName() + " flips: ");
            Card card1 = player1.flip();
            card1.describe();

            System.out.print(player2.getName() + " flips: ");
            Card card2 = player2.flip();
            card2.describe();

            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins the round!");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins the round!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println("Score: " + player1.getName() + ": " + player1.getScore() + " | " + 			player2.getName() + ": " + player2.getScore());
            System.out.println();
        }

        System.out.println("Final Score:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}










