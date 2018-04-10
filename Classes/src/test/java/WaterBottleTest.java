import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle(100);
    }

    @Test
    public void canItDrink(){
        assertEquals(90, bottle.drink());
    }

    @Test
    public void canItEmpty(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canItFill(){
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }

}
