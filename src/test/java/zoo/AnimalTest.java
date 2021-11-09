package zoo;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AnimalTest extends TestBase{

    @Test(groups = {GroupTest.SMOKE, GroupTest.REGRESSION, GroupTest.SANITY})
    public void testSpeaks() {
        int legs = 4;
        String breath = "air";
        String moves = "on land";
        System.out.println("Animals have: " + legs + " legs");
        assertEquals(4, 4);
        System.out.println("Animal breath: " + breath);
        assertEquals("air", "air");
        System.out.println("Animal moves and lives: " + moves);
        assertEquals("on land", "on land");

    }
}