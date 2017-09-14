package game;

public class Turn {
    Player player;

    private Turn prev;
    private Turn next;

    public Turn(Player p, Turn pr, Turn n){
        this.prev = pr;
        this.next = n;
        this.player = p;
    }

    public void setPrev(Turn t){
        this.prev = t;
    }

    public Turn getPrev(){
        return this.prev;
    }

    public void setNext(Turn t){
        this.next = t;
    }

    public Turn getNext(){
        return this.next;
    }

    public String toString(){
        String result = "Turn: " + player + '\n';
        return result;
    }

    public void setPlayer(Player p){
        // Do nothing.
        // This is intentional
    }

    public static class MazeTurn extends Turn{
        public MazeTurn(Turn pr, Turn n) {
            super(null, pr, n);
        }
        public void setPlayer(Player p){
            this.player = p;
        }
        public String toString(){
            String result = "M-Turn: " + player + '\n';
            return result;
        }
    }
}
