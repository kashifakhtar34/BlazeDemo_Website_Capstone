package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

    public static String captureScreenshot(
            WebDriver driver,
            String testName) {

        String folder =
                System.getProperty("user.dir")
                + "/test-output/Screenshots";

        new File(folder).mkdirs();

        String path =
                folder + "/"
                + testName + "_"
                + System.currentTimeMillis()
                + ".png";

        try {

            File src =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.FILE);

            File dest = new File(path);

            FileUtils.copyFile(src, dest);

            System.out.println("Screenshot saved at: " + path);

        } catch (IOException e) {

            e.printStackTrace();
        }

        return path;
    }
}