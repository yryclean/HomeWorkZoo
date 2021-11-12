package zoo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    @BeforeTest
    public void setUp() {
        System.out.println("Some checks here...");
    }
    @AfterTest
    public void tearDown() {
        System.out.println("\nAll checks are completed!");
    }
}
