package com.qa.base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;

public class Base implements WebDriver
{
    // ==================================================
    // VARIABLES
    // ==================================================

    private static Base instance;
    private WebDriver driver;
    private Properties properties;

    // ==================================================
    // CLASS LOGIC
    // ==================================================

    private void initialize()
    {
        reduceChromeDriverLogging();
        loadConfigFile();

        String chromePath = System.getProperty("user.dir") + "/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    /**
     * Reduces number of ChromeDriver log output to the console,
     * makes console cleaner and easier to see important output.
     * Use with caution, it might disable important logs in case of crash etc.
     */
    private void reduceChromeDriverLogging()
    {
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
    }

    private void loadConfigFile()
    {
        try
        {
            properties = new Properties();
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public void doubleClickWithJavascript(WebElement element)
    {
        String jsCode = "var evObj = new MouseEvent('dblclick', {bubbles: true, cancelable: true, view: window});";
        jsCode += " arguments[0].dispatchEvent(evObj);";
        ((JavascriptExecutor)driver).executeScript(jsCode, element);
    }

    public void clickWithJavaScript(WebElement element)
    {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public WebElement getElementWhenClickable(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Draws red border around element, useful for debuging.
     * @param element that will have border around it
     */
    public void drawBorder(WebElement element)
    {
        try
        {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].style.border='3px solid red'", element);
        }
        catch (StaleElementReferenceException ignored)
        {

        }
    }

    public void sleep(long milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    // ==================================================
    // GETTERS AND SETTERS
    // ==================================================

    public Properties getProperties()
    {
        return properties;
    }
    
    public WebDriver getWebDriver()
    {
        return driver;
    }

    // ==================================================
    // SINGLETON HOLDER
    // ==================================================

    public static Base getInstance()
    {
        if (instance == null)
        {
            instance = new Base();
        }
        return instance;
    }

    private Base()
    {
        initialize();
    }

    // ==================================================
    // INTERFACE IMPLEMENTATION
    // ==================================================

    @Override
    public void get(String s)
    {
        driver.get(s);
    }

    @Override
    public String getCurrentUrl()
    {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle()
    {
        return driver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public String getPageSource() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }

    @Override
    public Set<String> getWindowHandles() {
        return null;
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public TargetLocator switchTo() {
        return null;
    }

    @Override
    public Navigation navigate() {
        return null;
    }

    @Override
    public Options manage() {
        return null;
    }
}