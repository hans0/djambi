package game_pieces;

import game.Player;

public class Board {

    private static Board instance = null;
    private Piece[][] board;

    public Player red = new Player(Piece.Color.RED);
    public Player blue = new Player(Piece.Color.BLUE);
    public Player yellow = new Player(Piece.Color.YELLOW);
    public Player green = new Player(Piece.Color.GREEN);


    private Board(){
        board = new Piece[9][9];

        /* RED */
        board[8][0] = red.addPiece(new Chief(8, 0, Piece.Color.RED));
        board[8][1] = red.addPiece(new Assassin(8, 1, Piece.Color.RED));
        board[6][0] = red.addPiece(new Militant(6, 0, Piece.Color.RED));
        board[6][1] = red.addPiece(new Militant(6, 1, Piece.Color.RED));
        board[7][2] = red.addPiece(new Militant(7, 2, Piece.Color.RED));
        board[8][2] = red.addPiece(new Militant(8, 2, Piece.Color.RED));
        board[6][2] = red.addPiece(new Necromobile(6, 2, Piece.Color.RED));
        board[7][1] = red.addPiece(new Diplomat(7, 1, Piece.Color.RED));
        board[7][0] = red.addPiece(new Reporter(7, 0, Piece.Color.RED));

        board[8][8] = blue.addPiece(new Chief(8, 8, Piece.Color.BLUE));
        board[8][7] = blue.addPiece(new Assassin(8, 7, Piece.Color.BLUE));
        board[6][7] = blue.addPiece(new Militant(6, 7, Piece.Color.BLUE));
        board[6][8] = blue.addPiece(new Militant(6, 8, Piece.Color.BLUE));
        board[7][6] = blue.addPiece(new Militant(7, 6, Piece.Color.BLUE));
        board[8][6] = blue.addPiece(new Militant(8, 6, Piece.Color.BLUE));
        board[6][6] = blue.addPiece(new Necromobile(6, 6, Piece.Color.BLUE));
        board[7][7] = blue.addPiece(new Diplomat(7, 7, Piece.Color.BLUE));
        board[7][8] = blue.addPiece(new Reporter(7, 8, Piece.Color.BLUE));

        board[0][8] = yellow.addPiece(new Chief(0, 8, Piece.Color.YELLOW));
        board[0][7] = yellow.addPiece(new Assassin(0, 7, Piece.Color.YELLOW));
        board[0][6] = yellow.addPiece(new Militant(0, 6, Piece.Color.YELLOW));
        board[1][6] = yellow.addPiece(new Militant(1, 6, Piece.Color.YELLOW));
        board[2][7] = yellow.addPiece(new Militant(2, 7, Piece.Color.YELLOW));
        board[2][8] = yellow.addPiece(new Militant(2, 8, Piece.Color.YELLOW));
        board[2][6] = yellow.addPiece(new Necromobile(2, 6, Piece.Color.YELLOW));
        board[1][7] = yellow.addPiece(new Diplomat(1, 7, Piece.Color.YELLOW));
        board[1][8] = yellow.addPiece(new Reporter(1, 8, Piece.Color.YELLOW));

        board[0][0] = green.addPiece(new Chief(0, 0 , Piece.Color.GREEN));
        board[0][1] = green.addPiece(new Assassin(0, 1 , Piece.Color.GREEN));
        board[0][2] = green.addPiece(new Militant(0, 2, Piece.Color.GREEN));
        board[1][2] = green.addPiece(new Militant(1, 2, Piece.Color.GREEN));
        board[2][0] = green.addPiece(new Militant(2, 0, Piece.Color.GREEN));
        board[2][1] = green.addPiece(new Militant(2, 1, Piece.Color.GREEN));
        board[2][2] = green.addPiece(new Necromobile(2, 2, Piece.Color.GREEN));
        board[1][1] = green.addPiece(new Diplomat(1, 1, Piece.Color.GREEN));
        board[1][0] = green.addPiece(new Reporter(1, 0, Piece.Color.GREEN));
    }

    public Piece[][] getBoard() {
        return board;
    }

    public static Board getInstance(){
        if (instance == null){
            instance = new Board();
        }
        return instance;
    }

    public void resetBoard(){
        instance = new Board();
    }

    public String toString(){
        String result = "----------------------------------------------\n";
        for (int i = 0; i < board.length; i++) {
            result += "| ";
            for (int j = 0; j < board[i].length; j++) {
                if (i == 4 && j == 4 && board[i][j] == null)
                    result += "MZ";
                else if (board[i][j] == null)
                    result += "  ";
                else
                    result += board[i][j];
                result += " | ";
            }
            result += "\n----------------------------------------------\n";
        }
        return result;
    }

    public String printCoordBoard(){
        String result = "----------------------------------------------\n";
        for (int i = 0; i < board.length; i++) {
            result += "| ";
            for (int j = 0; j < board[i].length; j++) {
                result += "[" + i + "," + j + "]";

                result += " | ";
            }
            result += "\n----------------------------------------------\n";
        }
        return result;
    }
}