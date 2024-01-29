package fr.lecampusnumerique.cda25.squareGames.cell;

public class TicTacToeCell extends Cell{
    public TicTacToeCell() {
        super(TictacToeSymbol.DEFAULT);
    }

    @Override
    public String getRepresentation() {
        return "| " + getSymbol().getRepresentation() + " ";
    }
}
