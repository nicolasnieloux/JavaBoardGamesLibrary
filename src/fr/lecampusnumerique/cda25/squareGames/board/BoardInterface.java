package fr.lecampusnumerique.cda25.squareGames.board;

import fr.lecampusnumerique.cda25.squareGames.cell.Cell;
import fr.lecampusnumerique.cda25.squareGames.utils.Coordinate;

import java.util.HashMap;

public interface BoardInterface {
    void initializeBoard(int x, int y);
    HashMap<Coordinate, Cell> getFreeCell(Coordinate coordinates);

}
