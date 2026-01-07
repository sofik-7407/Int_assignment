package com.INT.assignment.utilt;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportManager {

    public static ExtentReports extent;
    public static ExtentTest test;

    public static void initReport() {
        ExtentSparkReporter reporter =
                new ExtentSparkReporter("reports/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
    }

    public static void flushReport() {
        extent.flush();
    }
}
