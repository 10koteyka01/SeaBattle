package vessels;

import entities.implementations.Point;
import entities.implementations.VesselImpl;
import entities.interfaces.Vessel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VesselTest {
    @Test
    @DisplayName("Содержит ли судно точку")
    void vesselContainsPoint() {
        Vessel vessel = new VesselImpl(3);
        vessel.setDeck(new Point(1, 1));
        vessel.setDeck(new Point(1, 2));
        vessel.setDeck(new Point(1, 3));

        assertTrue(vessel.isVesselContainsPoint(new Point(1, 1)));
    }

    @Test
    @DisplayName("Судно не содержит точки")
    void vesselNotContainsPoint() {
        Vessel vessel = new VesselImpl(3);
        vessel.setDeck(new Point(1, 1));
        vessel.setDeck(new Point(1, 2));
        vessel.setDeck(new Point(1, 3));

        assertFalse(vessel.isVesselContainsPoint(new Point(2, 1)));
    }
}
