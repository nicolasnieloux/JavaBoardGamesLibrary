package fr.lecampusnumerique.cda25.squareGames.board;

import fr.lecampusnumerique.cda25.squareGames.cell.Cell;
import fr.lecampusnumerique.cda25.squareGames.cell.TicTacToeCell;
import fr.lecampusnumerique.cda25.squareGames.utils.Coordinate;

import java.util.HashMap;

public class Board implements BoardInterface {

    private HashMap<Coordinate, Cell> board;
    int x;
    int y;

    public Board(int x, int y) {
        this.x = x;
        this.y = y;
        this.board = new HashMap<Coordinate, Cell>();
        initializeBoard(x, y);
    }

    public void initializeBoard(int x, int y) {
        for (int i = 1; i < y + 1; i++) {
            for (int j = 1; j < x + 1; j++) {
                board.put(new Coordinate(i, j), new TicTacToeCell());
            }
        }

    }

    public Cell getCellInPositionXY(int x, int y) {
        return board.get(new Coordinate(x, y));
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public HashMap<Coordinate, Cell> getFreeCell(Coordinate coordinates) {
        return null;
    }

}
