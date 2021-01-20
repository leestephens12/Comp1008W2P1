import java.util.Scanner;

public class CreateACard {
    public static void main(String[] args) {

        //Create a Scanner
        //data type   object name     Calling the contrsuctor
        Scanner       scanner         = new Scanner(System.in);

        Card aceOfSpades = new Card("Ace", "Spades", 14 );

        System.out.println(aceOfSpades);
    }
}
