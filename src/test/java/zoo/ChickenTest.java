package zoo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
@Listeners(ScreenshotListener.class)
public class ChickenTest extends TestBase {

    @Test(groups = GroupTest.REGRESSION)
    public void testSpeaks() {
        int legs = 2;
        String breath = "air";
        String moves = "on land and a bit in air";
        System.out.println("Chicken have: " + legs + " legs");
        assertEquals(2, 2);
        System.out.println("Chicken breath: " + breath);
        assertEquals("air", "air");
        System.out.println("Chicken can move and live: " + moves);
        assertEquals("on land and a bit in air", "on land and a bit in air");
        fail();
    }

    @Test(groups = GroupTest.NEGATIVE)
    public void testFly() {
            String canFly = "Almost all wild birds can fly";
            String cannotFly = "Farmers or household birds cannot fly";
            int wings = 100;
            boolean isHouseHold = !false;
            if (wings == 2 && isHouseHold) {
                System.out.println(cannotFly);
            } else if(wings == 2 && !isHouseHold){
                System.out.println(canFly);
            } else
                System.out.println("Wrong entry");
            assertEquals("Wrong entry", "Wrong entry");
        }
    }