package com.justeattask.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import com.justeattask.utils.DriverFactory;

public class Hooks {
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://just-eat.co.uk");
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
