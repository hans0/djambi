package game_pieces;

public class Necromobile extends Piece {

    public Necromobile(int x, int y, Color c){
        super(x, y, c);
    }

    @Override
    public void move(Board b, int newRow, int newCol){
        //b.getBoard()[newRow][newCol] = this;

    }

    @Override
    public void relocateOther(Board b, int newRow, int newCol) {

    }

    @Override
    public boolean canMoveThere(Board b, int newRow, int newCol) {
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        switch(this.color){
            case RED:
                result += 'r';
                break;
            case GREEN:
                result += 'g';
                break;
            case BLUE:
                result += 'b';
                break;
            case YELLOW:
                result += 'y';
                break;
            default:

        }
        result += 'N';
        return result;
    }
}
