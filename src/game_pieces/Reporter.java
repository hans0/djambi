package game_pieces;

public class Reporter extends Piece {

    public Reporter(int x, int y, Color c){
        super(x, y, c);
        //this.location = new Location(x, y);
        //this.color = c;
    }

    @Override
    public void move(Board b, int destRow, int destCol){
    }

    @Override
    public void relocateOther(Board b, int newRow, int newCol) {

    }

    @Override
    public boolean canMoveThere(Board b, int destRow, int destCol) {
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
        result += 'R';
        return result;
    }
}
