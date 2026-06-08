package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getReport() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "test-output/ExtentReport.html");

            spark.config().setDocumentTitle(
                    "BlazeDemo Report");

            spark.config().setReportName(
                    "Automation Execution Report");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo(
                    "Tester",
                    "Kashif Akhtar");

            extent.setSystemInfo(
                    "Environment",
                    "QA");
        }

        return extent;
    }
}