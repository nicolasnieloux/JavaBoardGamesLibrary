package fr.lecampusnumerique.cda25.squareGames.game;

import fr.lecampusnumerique.cda25.squareGames.board.Board;
import fr.lecampusnumerique.cda25.squareGames.cell.Symbol;
import fr.lecampusnumerique.cda25.squareGames.cell.TicTacToeSymbol;
import fr.lecampusnumerique.cda25.squareGames.player.AIPlayer;
import fr.lecampusnumerique.cda25.squareGames.player.HumanPlayer;
import fr.lecampusnumerique.cda25.squareGames.player.Player;
import fr.lecampusnumerique.cda25.squareGames.utils.Coordinate;
import fr.lecampusnumerique.cda25.squareGames.utils.UserInteract;
import fr.lecampusnumerique.cda25.squareGames.utils.Validator;
import fr.lecampusnumerique.cda25.squareGames.utils.View;

public class TicTacToe implements GameInterface {
    private Validator validator = new Validator();
    private Board board = new Board(3, 3);
    private Player player1;
    private Player player2;
    private Player currentPlayer;


    public void play() {
        View.getInstance().displayWelcomeMessage();
        getNewGame(getModeChoices());
        View.getInstance().displayBoard(3, board);

    }

    public boolean isOver() {
        return true;
    }

    public boolean hasWinner(Player player, Coordinate coordonates, Board board) {
        return true;
    }

    public boolean isBoardFull() {
        return true;
    }

    public void getNewGame(int choice) {

        if (choice == 0) {
            player1 = new HumanPlayer(Symbol.X);
            currentPlayer = player1;
            player2 = new HumanPlayer(Symbol.Y);
        }
        if (choice == 1) {

            player1 = new HumanPlayer(Symbol.X);
            currentPlayer = player1;
            player2 = new AIPlayer(Symbol.Y);
        }
        if (choice == 2) {
            player1 = new AIPlayer(Symbol.X);
            currentPlayer = player1;
            player2 = new AIPlayer(Symbol.Y);
        }
    }

    public void nextPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private int getModeChoices() {
        String modeChoice = "";
        while (!validator.isValidChoice(modeChoice)) {
            View.getInstance().displayChoiceMode();
            modeChoice = UserInteract.getInstance().getUserInput();
        }
        return Integer.parseInt(modeChoice);
    }
}

