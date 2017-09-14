package game_pieces;

public class Corpse extends Piece {
    public Corpse(int x, int y, Color c) {
        super(x, y, Color.BLACK);
    }

    @Override
    public boolean canMoveThere(Board b, int newRow, int newCol) {
        return false;
    }

    @Override
    public void move(Board b, int newRow, int newCol) {

    }

    @Override
    public void relocateOther(Board b, int newRow, int newCol) {

    }

    @Override
    public String toString(){
        return "" + '\u25A0' + '\u25A0';
    }
}
