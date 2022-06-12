package entities.interfaces;

import entities.implementations.Point;

public interface Vessel {
    boolean isVesselContainsPoint(Point point);
    boolean setDeck(Point point);
}
