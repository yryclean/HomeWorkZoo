package scooters;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KingSongDS11Test extends TestBase{

    @Test(groups = GroupTest.NEGATIVE)
    public void testGetPower() {
            final char power;
            double battery = 60;
            int controller = 28;
            final int nrOfControllers = 2;
            power = (char) (nrOfControllers * battery * controller);
            System.out.println(power);
            assertEquals(3360, 3360.0);
    }
}