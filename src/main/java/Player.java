public class Player {

    String name;
    Board.Mark symbol;

    Player(String name, Board.Mark symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public boolean isSimbolMine(Board.Mark m) {
        return m == symbol;
    }

    @Override
    public String toString() {
        return "Numele jucatorului este " + name + " si simbolul este " + symbol;
    }
}
