package fr.lecampusnumerique.cda25.squareGames.cell;

public interface CellInterface {
    SymbolInterface getSymbol();

    String getRepresentation();

    boolean isOccupied();

    void occupyCell(SymbolInterface symbol);
}
