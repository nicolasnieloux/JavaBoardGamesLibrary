package fr.lecampusnumerique.cda25.squareGames.game;

import fr.lecampusnumerique.cda25.squareGames.board.Board;
import fr.lecampusnumerique.cda25.squareGames.player.Player;
import fr.lecampusnumerique.cda25.squareGames.utils.Coordinate;
import fr.lecampusnumerique.cda25.squareGames.utils.View;

public class TicTacToe implements GameInterface{

    public void play(){
        View.getInstance().displayWelcomeMessage();
    }
    public boolean isOver(){
    return true;
    }

    public boolean hasWinner(Player player, Coordinate coordonates, Board board){
    return true;
    }

   public boolean isBoardFull(){
    return true;
    }
}
