package fr.lecampusnumerique.cda25.squareGames;

public interface CellInterface {
    Symbol getSymbol();

    String getRepresentation();

    boolean isOccupied();

    void occupyCell(Symbol symbol);
}
