package game;

import java.util.ArrayList;
import game_pieces.Piece;
import game_pieces.Piece.Color;

public class Player {
    private ArrayList<Piece> pieces;
    private Color color;
    public Player(Color c){
        this.color = c;
        this.pieces = new ArrayList<Piece>();
    }

    public Piece addPiece(Piece p){
        pieces.add(p);
        return p;
    }

    public Color getColor(){
        return this.color;
    }

    public ArrayList<Piece> getPieces(){
        return this.pieces;
    }

    public boolean equals(Object o){
        if (o instanceof Player)
            return ((Player) o).getColor().equals(this.getColor());
        else
            return false;

    }

    public String toString(){
        String result = "";
        switch(color){
            case RED:
                result += "RED";
                break;
            case BLUE:
                result += "BLUE";
                break;
            case YELLOW:
                result += "YELLOW";
                break;
            case GREEN:
                result += "GREEN";
                break;
            default:
        }
        return result;
    }
}
