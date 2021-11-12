package zoo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getName();
        System.out.printf("Test %s has failed, screenshot is saved", testName);
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        String testName = result.getName();
        System.out.printf("Test %s has been skipped", testName);
    }

}
