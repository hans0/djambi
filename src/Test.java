import game.TurnOrder;
import game_pieces.Board;
import game_pieces.Corpse;

public class Test {

    public static void main(String[] args) {
        Board b = Board.getInstance();
        b.getBoard()[3][3] = new Corpse(3, 3, null);
        System.out.println(b);

        TurnOrder turnOrder = new TurnOrder(b.red, b.blue, b.yellow, b.green);

        System.out.println(turnOrder);
        //System.out.println(b.getBoard()[2][2].checkLine(b, 6, 2));

        turnOrder.setMaze(b.red);
        System.out.println(turnOrder);
        turnOrder.setMaze(b.blue);
        System.out.println(turnOrder);
        turnOrder.setMaze(b.yellow);
        System.out.println(turnOrder);

        turnOrder.setMaze(b.red);
        System.out.println(turnOrder);

        turnOrder.removePlayer(b.red);

        //turnOrder.removePlayer(b.red);
        System.out.println("after removing red");
        System.out.println(turnOrder);
        turnOrder.removePlayer(b.yellow);
        System.out.println(turnOrder);

        turnOrder.setMaze(b.green);
        System.out.println(turnOrder);
        turnOrder.setMaze(b.blue);
        System.out.println(turnOrder);







    }
}