package fr.lecampusnumerique.cda25.squareGames.game;

import fr.lecampusnumerique.cda25.squareGames.board.Board;
import fr.lecampusnumerique.cda25.squareGames.player.Player;
import fr.lecampusnumerique.cda25.squareGames.utils.Coordinate;
import fr.lecampusnumerique.cda25.squareGames.utils.UserInteract;
import fr.lecampusnumerique.cda25.squareGames.utils.Validator;
import fr.lecampusnumerique.cda25.squareGames.utils.View;

public class TicTacToe implements GameInterface{
    private Validator validator = new Validator();
    private Board board = new Board(3,3);

    public void play(){
        View.getInstance().displayWelcomeMessage();

        String modeChoice = "";
        while(!validator.isValidChoice(modeChoice)){
            View.getInstance().displayChoiceMode();
            modeChoice = UserInteract.getInstance().getUserInput();
        }
        View.getInstance().displayBoard(3, board );

    }
    public boolean isOver(){return true;}

    public boolean hasWinner(Player player, Coordinate coordonates, Board board){
    return true;
    }

   public boolean isBoardFull(){
    return true;
    }
}
