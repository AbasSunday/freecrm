package com.qa.base;

import com.crm.utilities.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Base implements WebDriver{

    //private static String CHROME_PATH = "/Users/abas/Documents/freecrm/src/main/";  //TODO: Update my config path
    private static Base instance;
    public  WebDriver driver;
    public static Properties properties;
    public static EventFiringWebDriver event_Driver;
    public static WebDriverEventListener eventListener;



    public static Base getInstance(){

        if (instance == null){
            instance = new Base();
        }
        return instance;
    }

    public Base(){
        initialize();
    }

    public void initialize(){

            //String browserName = properties.getProperty("browser");

//            if (browserName.equals("chrome")) {
//                String chromePath = System.getProperty("user.dir") + "/resources/chromedriver";
//                System.setProperty("webdriver.chrome.driver", chromePath);
//                driver = new ChromeDriver();
//            }

            String chromePath = System.getProperty("user.dir") + "/resources/chromedriver";
            System.setProperty("webdriver.chrome.driver", chromePath);
            driver = new ChromeDriver();

//            event_Driver = new EventFiringWebDriver(driver);
//            eventListener = new WebElementListener();
//            event_Driver.register(eventListener);
//            driver = event_Driver;
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
            //driver.get("https://classic.crmpro.com/index.html");
            String url = properties.getProperty("url");
            System.out.println("The page URL ="+ url);
            driver.get (url);
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

    public WebElement getElementIfClickAble(By by, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement getElementIfVisible(By by, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement getElementIfPresent(By by, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }


    @Override
    public void get(String s) {
        driver.get(s);
    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
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
