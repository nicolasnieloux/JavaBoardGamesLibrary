package fr.lecampusnumerique.cda25.squareGames;

public interface GameInterface {
    void play();

    boolean isOver();

    boolean hasWinner(Player player, Coordonate coordonates, Board board);

    boolean isBoardFull();
}
