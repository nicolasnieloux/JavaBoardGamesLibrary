package fr.lecampusnumerique.cda25.squareGames.utils;

public class Validator {

    public boolean isValidChoice(String gameChoice){
        return gameChoice.matches("[1-3]");
    }
    

    /*
    public int verifyInputUser(int InputUser, int size) {
        while (InputUser > size - 1 || InputUser < 0) {
            view.displayCorrectXy();
            InputUser = interractionUser.getInputUser();
        }
        return InputUser;
    }
    
     */
}
