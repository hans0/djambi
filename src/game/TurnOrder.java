package game;

import game_pieces.Piece;
import game.Turn;
import game.Turn.MazeTurn;

public class TurnOrder {
    Turn current;
    private byte numberPlayers;
    private Turn start;

    public TurnOrder(Player p1, Player p2, Player p3, Player p4){
        numberPlayers = 4;
        start = new Turn(p1, null, null);
        Turn turn2 = new Turn(p2, null, null);
        Turn turn3 = new Turn(p3, null, null);
        Turn turn4 = new Turn(p4, null, null);
        MazeTurn after1 = new MazeTurn(start, turn2);
        MazeTurn after2 = new MazeTurn(turn2, turn3);
        MazeTurn after3 = new MazeTurn(turn3, turn4);
        MazeTurn after4 = new MazeTurn(turn4, start);
        start.setPrev(after4);
        start.setNext(after1);
        turn2.setPrev(after1);
        turn2.setNext(after2);
        turn3.setPrev(after2);
        turn3.setNext(after3);
        turn4.setPrev(after3);
        turn4.setNext(after4);
        current = start;
    }

    public Turn getTurn(){
        return current;
    }

    public void setMaze(Player p){
        Turn ptr = start;
        // Clearing out the maze turns
        while (ptr.getNext() != start){
            if(ptr instanceof MazeTurn){
                ((MazeTurn) ptr).setPlayer(null);
            }
            ptr = ptr.getNext();
        }
        // Getting to the right location
        ptr = ptr.getNext();
        while (ptr.getNext() != start){
            if (ptr.player != null && ptr.player.getColor().equals(p.getColor()))
                break;
            ptr = ptr.getNext();
        }

        if (numberPlayers == 4){
            ptr = ptr.getNext().getNext().getNext();
            //System.out.println(ptr);
            ptr.setPlayer(p);
            ptr = ptr.getNext().getNext();
            ptr.setPlayer(p);
            //
            ptr = ptr.getNext().getNext();
            ptr.setPlayer(null);
        } else if (numberPlayers == 3){
            ptr = ptr.getNext().getNext().getNext();
            ptr.setPlayer(p);
        } else {
            ptr = ptr.getNext();
            ptr.setPlayer(p);
        }

    }

    public void removePlayer(Player p){
        if (start.player.equals(p)){
            start = start.getNext().getNext();
        }
        Turn ptr = start.getNext();

        do {
            if (ptr instanceof MazeTurn){
                //System.out.println(ptr);
                if (p.equals(ptr.player))
                    ptr.setPlayer(null);
            } else if (ptr.player.equals(p)){
                ptr.getPrev().setNext(ptr.getNext().getNext());
                ptr.getNext().getNext().setPrev(ptr.getPrev());
            }
            ptr = ptr.getNext();
        } while (ptr != start.getNext());
        /**
         * ATTEMPT 1
        if (start.player.equals(p)){
            start = start.getNext().getNext();
        }
        Turn ptr = start.getNext();

        do {
            //System.out.println(ptr);
            if (ptr instanceof MazeTurn){
                System.out.println("Encountered maze turn");
                System.out.println(ptr);
                if (p.equals(ptr.player)){
                    ptr.setPlayer(null);
                }
                ptr = ptr.getNext();
                continue;
            }
            else if (ptr.player.equals(p)){
                //System.out.println(ptr);

                ptr.getPrev().setNext(ptr.getNext().getNext());
                ptr.getNext().getNext().setPrev(ptr.getPrev());
                return;
            }
            ptr = ptr.getNext();
        } while (ptr != start.getNext());

        numberPlayers--;

        setMaze(p);
         **/
    }

    public String toString(){
        String result = "";
        Turn ptr = start;
        do {
            result += ptr;
            //System.out.println(ptr);
            ptr = ptr.getNext();
        } while(ptr != start);
        return result;
    }

}
