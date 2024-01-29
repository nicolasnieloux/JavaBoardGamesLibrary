package fr.lecampusnumerique.cda25.squareGames.utils;

import java.util.Objects;

public class Coordinate  {
    private final int x;
    private final int y;
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setCoordinates(int x, int y) {
        if(x < 0) x = 0;
        if(y < 0) y = 0;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinate that)) return false;
        return x == that.x && y == that.y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }
}
