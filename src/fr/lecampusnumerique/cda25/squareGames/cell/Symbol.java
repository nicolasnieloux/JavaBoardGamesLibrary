package fr.lecampusnumerique.cda25.squareGames.cell;

public enum Symbol implements SymbolInterface {
    DEFAULT(" ", true),
    X("X",true),
    Y("Y",true),
    O("O", true),
    R("R", true),
    B("B", true);
    private String representation;
    private boolean isDefault;

    @Override
    public String getRepresentation() {
        return representation;
    }

    @Override
    public boolean isDefault() {
        return this.isDefault;
    }

    Symbol(String representation, boolean isDefault) {
        this.representation = representation;
    }
}
