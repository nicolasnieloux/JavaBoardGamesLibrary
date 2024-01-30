package fr.lecampusnumerique.cda25.squareGames.player;

import fr.lecampusnumerique.cda25.squareGames.cell.Symbol;

public abstract class Player implements PlayerInterface {

    // Attributs
    private Symbol symbol;

    /**
     * Constructs a player with the specified symbol.
     *
     * @param symbol of the player. Should be either "X" or "O".
     * @throws IllegalArgumentException If the symbol is not "X" or "O".
     */
    public Player(Symbol symbol) {
        if (symbol.equals("X") || symbol.equals("O")) {
            this.symbol = Symbol.valueOf("|  " + symbol);
        } else {
            throw new IllegalArgumentException("La représentation doit être \"| X\" ou \"| O\"");
        }
    }
}
