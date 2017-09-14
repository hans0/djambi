package game_pieces;

public class Militant extends Piece {

    //private Location location;
    //private Color color;

    public Militant(int x, int y, Color c){
        super(x, y, c);
        //this.color = c;
        //this.location = new Location(x, y);
    }

    @Override
    public void move(Board b, int newRow, int newCol){
    }

    @Override
    public void relocateOther(Board b, int newRow, int newCol) {

    }

    // The Militant can only move two spaces at a time, either orthogonally or diagonally
    public boolean canMoveThere(Board b, int destX, int destY){

        if (!this.getLocation().inBounds(destX, destY))
            return false;
        if (this.getLocation().getX() == destX && this.getLocation().getY() == destY)
            return false;

        /*
        // Non-diagonal movement
        if (
                ((Math.abs(this.getLocation().getX() - destX) == 1 || Math.abs(this.getLocation().getY() - destY) == 2)
                        && this.getLocation().getY() - destY == 0)
                        ||
                ((Math.abs(this.getLocation().getY() - destY) == 1 || Math.abs(this.getLocation().getY() - destY) == 2)
                        && this.getLocation().getX() - destX == 0))
            return true;
        // Diagonal movement
        if (((Math.abs(this.getLocation().getX() - destX) <= 2) && Math.abs(this.getLocation().getY() - destY) <= 2))
            return true;
*/
        return false;
    }

    public String toString(){
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
        result += 'M';
        return result;

    }
}
