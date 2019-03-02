abstract class Referee implements Readable {

    private Board board;
    private Player player1;
    private Player player2;
    private boolean xTurn;

    public Referee(Player player1, Player player2) {
        board = new Board();
        this.player1 = player1;
        this.player2 = player2;
        this.xTurn = true;
    }

    @Override
    public String toString() {
        return player1 + " VS " + player2;
    }

    public Player start() {
        int coord[];
        while (true) {
            coord = getCoord();
            board.move(coord[0], coord[1], xTurn ? Board.Mark.MARK_X : Board.Mark.MARK_0);
            System.out.println(board);
            if (board.isGameOver(coord[0], coord[1])) {
                break;
            }
            if (xTurn == true) {
                xTurn = false;
            } else {
                xTurn = true;
            }

        }
        Board.Mark aux = board.getWinner(coord[0], coord[1]);
        if (player1.isSimbolMine(aux)) {
            return player1;
        }
        if (player2.isSimbolMine(aux)){
            return player2;
        }
        return null;
    }
}
