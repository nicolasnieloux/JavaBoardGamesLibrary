package fr.lecampusnumerique.cda25.squareGames.game;

import fr.lecampusnumerique.cda25.squareGames.board.Board;
import fr.lecampusnumerique.cda25.squareGames.player.Player;
import fr.lecampusnumerique.cda25.squareGames.utils.Coordinate;

public interface GameInterface {
    void play();

    boolean isOver();

    boolean hasWinner(Player player, Coordinate coordonates, Board board);

    boolean isBoardFull();
}
