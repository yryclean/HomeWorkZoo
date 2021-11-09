package zoo;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SharkTest extends TestBase{

    @Test(groups = { GroupTest.SMOKE, GroupTest.REGRESSION })
    public void testSwim() {
        System.out.println("Shark swims in water and cannot live outside the water");
        assertEquals("Shark swims in water and cannot live outside the water", "Shark swims in water and cannot live outside the water");
    }

    @Test(groups = { GroupTest.SMOKE, GroupTest.REGRESSION })
    public void testSpeaks() {
        int legs = 0;
        String breath = "air from water";
        String moves = "in water";
        System.out.println("Shark has no: " + legs + " legs");
        assertEquals(0, 0);
        System.out.println("Shark breath: " + breath);
        assertEquals("air from water", "air from water");
        System.out.println("Shark moves and lives: " + moves);
        assertEquals("in water", "in water");
    }

    @Test(groups = { GroupTest.SMOKE, GroupTest.REGRESSION })
    public void testHunt() {
        System.out.println("Shark hunts on other fish, birds or little animals that get in water");
        assertEquals("Shark hunts","Shark hunts");
    }
}