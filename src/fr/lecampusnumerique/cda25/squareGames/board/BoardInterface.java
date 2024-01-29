package fr.lecampusnumerique.cda25.squareGames.board;

import java.util.HashMap;

public interface BoardInterface {
    void initializeBoard(int x, int y);
    HashMap<Coordinate, Cell> getFreeCell(Coordinate coordinates);

}
