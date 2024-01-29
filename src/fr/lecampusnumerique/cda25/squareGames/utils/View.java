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
}
