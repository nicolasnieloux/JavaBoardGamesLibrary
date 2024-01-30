package fr.lecampusnumerique.cda25.squareGames.player;

import fr.lecampusnumerique.cda25.squareGames.cell.Symbol;

public class HumanPlayer extends Player{
    /**
     * Constructs a player with the specified symbol.
     *
     * @param symbol of the player. Should be either "X" or "O".
     * @throws IllegalArgumentException If the symbol is not "X" or "O".
     */
    public HumanPlayer(Symbol symbol) {
        super(symbol);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Symbol getSymbol() {
        return null;
    }
}
