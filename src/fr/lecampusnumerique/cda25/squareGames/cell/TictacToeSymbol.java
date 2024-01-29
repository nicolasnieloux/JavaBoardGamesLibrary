package fr.lecampusnumerique.cda25.squareGames.cell;

public enum TictacToeSymbol implements SymbolInterface{
    DEFAULT(" ", true),
    X("X",true),
    O("O",true),
;


    TictacToeSymbol(String representation, boolean isDefault) {
        this.isDefault = isDefault;
        this.representation = representation;
    }

    private final String representation;
    private final boolean isDefault;

    @Override
    public String getRepresentation() {
        return representation;
    }

    @Override
    public boolean isDefault() {
        return this.isDefault;
    }
}
