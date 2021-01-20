public class Card {
    private String faceName;
    private int faceValue;
    private String suit;

    /**
     * This is the constructor. It doies not have a return type,
     * and the name must eb exactly the same as the class name (including the Upper Case letter)
     * You can have overloaded constructors.
     * @param faceName
     * @param suit
     * @param faceValue
     */
    public Card(String faceName, String suit, int faceValue) {

        setFaceName(faceName);
        setSuit(suit);
        setFaceValue(faceValue);
    }

    /**
     * This constructor should be used if you want ace's to be the highest card in the deck
     * @param faceName
     * @param suit
     */
    public Card(String faceName, String suit) {
        this.faceName = faceName;
        this.suit = suit;
    }
}
