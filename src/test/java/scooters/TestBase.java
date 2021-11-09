package scooters;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    @BeforeTest
    public void setUp() {
        System.out.println("Some checks here...");
    }
    @AfterTest
    public void tearDown() {
        System.out.println("All checks are completed!");
    }
}
