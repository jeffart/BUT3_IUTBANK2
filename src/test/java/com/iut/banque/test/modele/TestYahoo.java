package com.iut.banque.test.modele;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestYahoo {
/*
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    public String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }
    @Test
    public void testNaviguation() {
        driver.get("https://fr.yahoo.com/?p=us");
        driver.manage().window().setSize(new Dimension(1044, 680));
        {
            WebElement element = driver.findElement(By.cssSelector(".W\\(59\\.6\\%\\)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        js.executeScript("window.scrollTo(0,208)");
        driver.findElement(By.cssSelector(".ntk-item:nth-child(1) .StretchedBox")).click();
        js.executeScript("window.scrollTo(0,0)");
        js.executeScript("window.scrollTo(0,302.6666564941406)");
        {
            WebElement element = driver.findElement(By.linkText("les barrages levés par endroits"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.linkText("les barrages levés par endroits")).click();
        vars.put("win9283", waitForWindow(2000));
        driver.switchTo().window(vars.get("win9283").toString());
        driver.findElement(By.cssSelector(".gdpr-hfp-button--big")).click();
        driver.findElement(By.id("batchsdk-ui-alert__buttons_positive")).click();
    }*/
}
