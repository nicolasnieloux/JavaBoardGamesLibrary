package fr.lecampusnumerique.cda25.squareGames.utils;

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
        System.out.println("  1- Tic Tac Toe");
        System.out.println("  2- Gomoku");
        System.out.println("  3- Connect 4");
        System.out.println("Your Choice : ");

    }
}
