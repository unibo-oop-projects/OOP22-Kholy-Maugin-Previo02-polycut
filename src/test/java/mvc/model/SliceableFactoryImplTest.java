package mvc.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SliceableFactoryImplTest {
    private final SliceableFactoryImpl factory = new SliceableFactoryImpl();
    /**
     * Test class of the Sliceable Factory createBomb method. It controls that every Bomb created
     * respect the parameters given and is usable.
     */
    @Test
    void createBombTest() {
        /*Creating the first two bombs and controlling their position and velocity being different*/
        final Sliceable bomb1 = factory.createPolygon();
        final Sliceable bomb2 = factory.createPolygon();
        assertNotEquals(bomb1.getPosition(), bomb2.getPosition());
        assertNotEquals(bomb1.getVelocity(), bomb2.getVelocity());
    }

    /**
     * Test class of the Sliceable Factory createPolygon method. It controls that every Polygon created
     * respect the parameters given and is usable.
     */
    @Test
    void createPolygonTest() {
        /*Creating the first two polygons and controlling their position and velocity being different*/
        final Sliceable poly1 = factory.createBomb();
        final Sliceable poly2 = factory.createBomb();
        assertNotEquals(poly1.getPosition(), poly2.getPosition());
        assertNotEquals(poly1.getVelocity(), poly2.getVelocity());
    }
}
