package game_pieces;

public abstract class Piece {

    public enum Color {
        RED, BLUE, GREEN, YELLOW, BLACK
    }

    protected Color color;
    protected Location location;

    protected Piece(int x, int y, Color c){
        this.location = new Location(x, y);
        this.color = c;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color c){
        this.color = c;
    }

    public Location getLocation(){
        return this.location;
    }

    public void setLocation(int x, int y){
        this.location.setX(x);
        this.location.setY(y);
    }

    /*
     * This checks the line up to, but NOT including, the space to be occupied.
     *
     */
    public boolean checkLine(Board b, int destX, int destY){

        int currentX = this.getLocation().getX();
        int currentY = this.getLocation().getY();

        int rowOffset = 0;
        int colOffset = 0;

        if (currentX < destX)
            rowOffset = 1;
        else if (currentX > destX)
            rowOffset = -1;

        if (currentY < destY)
            colOffset = 1;
        else if (currentY > destY)
            colOffset = -1;

        //System.out.println(rowOffset + " " + colOffset);
        int y = currentY + colOffset;

        for (int x = currentX + rowOffset; x != destX || y != destY; x += rowOffset, y += colOffset) {
            if (b.getBoard()[x][y] != null) {
                return false;
            }
            //System.out.println(x +", " + y);
        }

        return true;
    }

    public abstract boolean canMoveThere(Board b, int newRow, int newCol);

    public abstract void move(Board b, int newRow, int newCol);

    public abstract void relocateOther(Board b, int newRow, int newCol);

}