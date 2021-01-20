import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        setFaceName(faceName);
        setSuit(suit);
    }

    public static List<String> getValidFaceNames() {
        return Arrays.asList("two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace");
    }


    public String getFaceName() {
        if(getValidFaceNames().contains(faceName))
            return faceName;
        else
            throw new IllegalArgumentException("Valid lists for face names are " +getValidFaceNames());
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        if(faceValue >= 1 && faceValue <= 14) {
            this.faceValue = faceValue;
        }
        else {
            throw new IllegalArgumentException("face Value must be between 1 and 14");
        }
    }

    public String getSuit() {
        return suit;
    }

    /**
     * This method will return an Arraylist of valid sut names
     * @return a list of strings
     */
    public static List<String> getValidSuits() {
        return Arrays.asList("Spades", "Clubs", "Hearts", "Diamonds");
    }

    public void setSuit(String suit) {
        if(getValidSuits().contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("Valid lists of suits are " +getValidSuits());
    }

    /**
     * This method will return a string that represents
     * the card with the face name and suit
     */
    public String toString() {
        return faceName + " of " + suit;
    }
}
