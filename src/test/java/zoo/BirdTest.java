package zoo;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BirdTest extends TestBase {

    @Test(groups = {GroupTest.SMOKE, GroupTest.REGRESSION})
    public void testSpeaks() {
        double legs = 2.1;
        String breath = "air";
        String moves = "on land";
        System.out.println("Bird have: " + legs + " legs");
        assertEquals(2.1, 2);
        System.out.println("Bird breath: " + breath);
        assertEquals("air", "air");
        System.out.println("Bird can move and live: " + moves);
        assertEquals("in air", "in air");
    }

    @Test(groups = {GroupTest.SMOKE, GroupTest.REGRESSION}, dependsOnMethods = "testSpeaks" )
    public void testFly() {
        String canFly = "Almost all wild birds can fly";
        String cannotFly = "Farmers or household birds cannot fly";
        int wings = 2;
        boolean isHouseHold = true;
        if (wings == 2 && !isHouseHold) {
            System.out.println(cannotFly);
        } else {
                System.out.println(canFly);
            }
            assertEquals(cannotFly, cannotFly);
        }
    }