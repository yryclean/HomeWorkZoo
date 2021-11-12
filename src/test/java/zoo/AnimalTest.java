package zoo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class AnimalTest extends TestBase {

    @Test(groups = {GroupTest.SMOKE, GroupTest.REGRESSION, GroupTest.SANITY}, dataProvider = "descriptions")
    public void testSpeaks(String breath, String moves, String legs) {
        System.out.printf("Animals breath %s. Animals move and live %s. Animals have %s", breath, moves, legs)
    }
    @DataProvider(name = "descriptions")
    public Object[][] myDataProvider() {
        return new Object[][] {
                { "air" , "on land" , "2 or 4 legs."}
        };
    }
}
