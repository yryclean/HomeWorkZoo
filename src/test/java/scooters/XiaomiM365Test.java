package scooters;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class XiaomiM365Test extends TestBase {

    @Test(groups = GroupTest.REGRESSION)
    public void testGetPower() {
        final byte power;
        double battery = 36;
        double controller = 15;
        power = (byte) ((byte)battery * (byte)controller);
        System.out.println(power);
        assertEquals(540, 540);

    }

    @Test(groups = GroupTest.NEGATIVE)
    public void testGetPower1() {
        final char power;
        double battery = 36;
        float controller = 15;
        power = (char) (battery * controller);
        System.out.println(power);
        assertEquals(540, 540);
    }
}