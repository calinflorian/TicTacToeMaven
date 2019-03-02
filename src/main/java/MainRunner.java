public class MainRunner {


    public static void main(String[] args) {
        Board x = new Board();
        System.out.println(x.toString());

        Player player1 = new Player("Florian", Board.Mark.MARK_X);
        Player player2 = new Player("Andrei", Board.Mark.MARK_0);


        TicTacToeConsole ticTacToeConsole = new TicTacToeConsole(player1, player2);
        System.out.println(ticTacToeConsole);
        ticTacToeConsole.start();

    }
}