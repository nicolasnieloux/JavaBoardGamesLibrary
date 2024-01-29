package fr.lecampusnumerique.cda25.squareGames.utils;

import java.util.Scanner;


public class UserInteract implements UserInterractInterface{
    private static UserInteract instance;
    private UserInteract(){}
    public static UserInteract getInstance(){
        if (instance == null){
            instance = new UserInteract();
        }
        return instance;
    }

    private static Scanner scanner = new Scanner(System.in);
    public String getUserInput(){
        // Returning the read data using readLine
        return scanner.nextLine();
    }

    public boolean isValid(){
        return true;
    }


}
