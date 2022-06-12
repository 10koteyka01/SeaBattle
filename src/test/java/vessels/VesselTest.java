package vessels;

import entities.implementations.Point;
import entities.implementations.VesselImpl;
import entities.interfaces.Vessel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Проверка создания кораблей
 */
public class VesselTest {
    @Test
    @DisplayName("Создать однопалубник")
    void setSingleDeckTest() {
        Vessel vessel = new VesselImpl(1);

        assertTrue(vessel.setDeck(new Point(1, 1)));
    }

    @Test
    @DisplayName("Создать трёхпалубник")
    void setThreeDecksTest() {
        Vessel vessel = new VesselImpl(3);

        vessel.setDeck(new Point(1, 1));
        vessel.setDeck(new Point(1, 2));

        assertTrue(vessel.setDeck(new Point(1, 3)));
    }

    @Test
    @DisplayName("Нельзя создать двухпалубник по диагонали")
    void isVesselNegativeLinear() {
        Vessel vessel = new VesselImpl(2);

        vessel.setDeck(new Point(1, 1));

        assertFalse(vessel.setDeck(new Point(2, 2)));
    }

    @Test
    @DisplayName("Создать двухпалубник по горизонтали")
    void isVesselPositiveLinear() {
        Vessel vessel = new VesselImpl(2);

        vessel.setDeck(new Point(1, 1));

        assertTrue(vessel.setDeck(new Point(1, 2)));
    }

    @Test
    @DisplayName("Нельзя установить больше палуб, чем запланировано")
    void vesselSizeTest() {
        Vessel vessel = new VesselImpl(1);

        vessel.setDeck(new Point(1, 1));

        assertFalse(vessel.setDeck(new Point(1, 2)));
    }

    @Test
    @DisplayName("Негативная проверка на попытку создать кривой корабль")
    void setThreeDecksNegativeTest() {
        Vessel vessel = new VesselImpl(3);

        assertTrue(vessel.setDeck(new Point(1, 1)));
        assertTrue(vessel.setDeck(new Point(1, 2)));

        assertFalse(vessel.setDeck(new Point(2, 2)));
    }

    @Test
    @DisplayName("Негативная проверка на попытку создать кривой корабль")
    void setBendDeckNegativeTest() {
        Vessel vessel = new VesselImpl(3);

        assertTrue(vessel.setDeck(new Point(1, 1)));
        assertTrue(vessel.setDeck(new Point(1, 2)));

        assertFalse(vessel.setDeck(new Point(2, 1)));
    }
}
