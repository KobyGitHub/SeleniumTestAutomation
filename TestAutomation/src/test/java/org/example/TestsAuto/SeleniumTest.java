package org.example.TestsAuto;

import browser.BrowserGetter;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class SeleniumTest {
    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.setUp();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void openComPageAndCheckTitle() {
        String expectedComTitle = "Example Domain";
        driver.get("https://www.example.com");
        Assertions.assertEquals(expectedComTitle, driver.getTitle());

    }

    @Test
    public void openOrgPageAndCheckTitle() {
        String expectedOrgTitle = "Example Domain";
        driver.get("https://www.example.org");
        Assertions.assertEquals(expectedOrgTitle, driver.getTitle());
    }
}
