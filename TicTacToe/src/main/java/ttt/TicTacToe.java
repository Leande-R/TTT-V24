package ttt;

public class TicTacToe {

    private Player player1;

    private Player player2;

    private Player curentPlayer;


    private Board board;


    public TicTacToe(Player player1, Player player2, Player curentPlayer, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.curentPlayer = curentPlayer;
        this.board = board;
    }


    public TicTacToe (TicTacToe toe){
        this.player1 = toe.player1;
        this.player2 = toe.player2;
        this.curentPlayer = toe.curentPlayer;
        this.board = toe.board;
    }


    public void start(){}


    private void switchCurrentPlayer(){}


    private boolean hasWinner(){
        return false;
    }

}
