package base;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.ExtentManager;
import utils.ScreenshotUtils;

public class BaseTest {

    protected WebDriver driver;

    protected static ExtentReports extent =
            ExtentManager.getReport();

    protected ExtentTest test;

    @BeforeMethod
    public void setup(Method method) {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://blazedemo.com");

        test = extent.createTest(method.getName());
        
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        try {

            
             if (result.getStatus() == ITestResult.FAILURE) {

                String screenshotPath =
                        ScreenshotUtils.captureScreenshot(
                                driver,
                                result.getName());

                test.fail(result.getThrowable());

                test.addScreenCaptureFromPath(
                        screenshotPath);
            }

            else if (result.getStatus() == ITestResult.SKIP) {

                test.skip("Test Skipped");
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        if (driver != null) {

            driver.quit();
        }
    }

    @AfterSuite
    public void flushReport() {

        extent.flush();
    }
}