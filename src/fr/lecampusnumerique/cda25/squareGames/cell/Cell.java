package fr.lecampusnumerique.cda25.squareGames.cell;

public abstract class Cell implements CellInterface{

    private SymbolInterface symbol;

    // Protected so that the children have to define the function and choose
    protected Cell(SymbolInterface symbol){
        this.symbol = symbol;
    }
    @Override
    public SymbolInterface getSymbol() {
        return this.symbol;
    }

    @Override
    public boolean isOccupied() {
        return !symbol.isDefault();
    }

    @Override
    public void occupyCell(SymbolInterface symbol) {
        this.symbol = symbol;
    }
}
