import java.util.Scanner;

class TicTacToeConsole extends Referee {

    Scanner scanner = new Scanner(System.in);

    public TicTacToeConsole(Player player1, Player player2) {
        super(player1, player2);
    }

    public int[] getCoord() {

        int row = scanner.nextInt();
        int col = scanner.nextInt();
        while (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Coordonatele introduse sunt gresite. Introduceti alte valori");
            row = scanner.nextInt();
            col = scanner.nextInt();
        }
        return new int[]{row, col};
    }
}