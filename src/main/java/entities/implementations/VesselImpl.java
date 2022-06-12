package entities.implementations;

import entities.interfaces.Vessel;

import java.util.ArrayList;
import java.util.List;

public class VesselImpl implements Vessel {
    private int decksCount;
    List<Point> points = new ArrayList<>();
    public VesselImpl(int decksCount) {
        this.decksCount = decksCount;
    }

    @Override
    public boolean isVesselContainsPoint(Point point) {
        return false;
    }

    @Override
    public boolean setDeck(Point point) {
        if (!isLinear(point) || points.size() == decksCount) return false;
        points.add(point);
        return true;
    }

    private boolean isLinear(Point point) {
        if (points.size() > 0) return
                !(isChangedX(point)) & (isChangedY(point));

        return true;
    }

    private boolean isChangedX(Point point) {
        return points.get(0).getX() != point.getX();
    }

    private boolean isChangedY(Point point) {
        return points.get(0).getY() != point.getY();
    }
}
