package fr.lecampusnumerique.cda25.squareGames.utils;

import fr.lecampusnumerique.cda25.squareGames.cell.Cell;
import fr.lecampusnumerique.cda25.squareGames.board.Board;
import fr.lecampusnumerique.cda25.squareGames.cell.TicTacToeCell;
import fr.lecampusnumerique.cda25.squareGames.game.TicTacToe;

public class View implements ViewInterface{

    private static View instance;

    private View(){};

    public static View getInstance(){
        if (instance == null){
            instance = new View();
        }
        return instance;
    }
    @Override
    public void displayCurrentBoard() {

    }

    public void displayWelcomeMessage(){
        System.out.println("Welcome to our games");
    }

    public void displayChoiceMode(){
        System.out.println("Please, choose your game");
        System.out.println("  Choose: ");
        System.out.println("  1 - Human vs Human");
        System.out.println("  2 - Human vs AI");
        System.out.println("  3 - AI vs AI 4");
        System.out.println("Your Choice : ");

    }


    public void displayBoard(int size, Board board) {
        for (int i = 0; i < size; i++) {
            printSeparationLine(size);
            for (int j = 0; j < size; j++) {
                System.out.print(board.getCellInPositionXY(i + 1, j + 1).getRepresentation());
            }
            System.out.println("|");
        }
        printSeparationLine(size);
    }

    private void printSeparationLine(int size){

        for (int i = 0; i< size; i++) {
            //Make it as long as the cell's representation string
            int lengthOfCell = new TicTacToeCell().getRepresentation().length();
            for(int j = 0; j < lengthOfCell; j++){
                System.out.print("_");
            }
        }
        System.out.println();
    }
}
