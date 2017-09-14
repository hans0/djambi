import game.Player;
import game_pieces.Board;
import game.TurnOrder;
import game_pieces.Piece;

public class Djambi {



    public static void main(String[] args) {
	    Board b = Board.getInstance();
	    System.out.println(b);



        TurnOrder turnOrder = new TurnOrder(b.red, b.blue, b.yellow, b.green);


        System.out.println(turnOrder);



    }
}
