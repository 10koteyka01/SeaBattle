package entities.implementations;

import entities.enums.PointType;

public class Point {
    private PointType state = PointType.EMPTY;
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PointType getState() {
        return state;
    }

    public void setState(PointType state) {
        this.state = state;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
