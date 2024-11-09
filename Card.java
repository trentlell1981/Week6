package Week6;

public class Card {
	
	/*
	 * The `Card` class represents a single card in the deck with two attributes: `value` and `name`.
	 * The constructor takes an integer `value` (representing the card's rank) and a `name` (representing 
	 * the card's name). Getter and setter methods are provided for both the `value`
	 * and `name` fields to allow access and modification of these attributes. The `describe()` method prints
	 *  the card's name to the console.
	 */

	
    private int value;
    private String name;

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println(name);
    }
}


