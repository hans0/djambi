package game_pieces;

public class Location {
    private int x;
    private int y;

    /**
     * Constructor for Location object.
     * @param y
     * @param x
     */
    public Location(int y, int x){
        this.x = x;
        this.y = y;
    }

    /**
     * Determines whether the location is within the bounds of the Board.
     * @param x
     * @param y
     * @return true if within the bounds, false otherwise.
     */
    public boolean inBounds(int x, int y){
        if ((x > 8 && x < -1) ||  (y > 8 && y < -1)){
            return false;
        }
        return true;
    }
    /**
     * Gets x-coordinate of the current location.
     * @return x
     */
    public int getX(){
        return x;
    }

    /**
     * Gets y-coordinate of the current location.
     * @return y
     */
    public int getY(){
        return y;
    }

    /**
     * Sets x-coordinate of the current location.
     */
    public void setX(int new_x){
        this.x = new_x;
    }

    /**
     * Sets y-coordinate of the current location.
     */
    public void setY(int new_y){
        this.y = new_y;
    }
}
