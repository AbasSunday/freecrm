package base;

import com.browserstack.local.Local;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utility.Utils;
import utility.enumBase.ElementState;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.logging.Level;


public class BrowserStackHub {

    private static final Logger logger = LogManager.getLogger(BrowserStackHub.class);
    public WebDriver driver;
    private static Properties properties;
    private static BrowserStackHub instance;

    private Local l;

    @BeforeMethod(alwaysRun=true)
    @Parameters(value={"config", "environments", "proxySetting"})
    public void setUp(String config_file, String environment, String proxy) throws Exception {
        JSONParser parser = new JSONParser();
        JSONObject config = (JSONObject) parser.parse(new FileReader("C:\\Users\\d10586\\IdeaProjects\\cardifpinnacle_pet_insurance_framework\\resources\\config\\" + config_file));
        System.out.println(config_file);
        JSONObject envs = (JSONObject) config.get("environments");
        JSONObject proxySettings = (JSONObject) config.get("proxySetting");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        Map<String, String> envCapabilities = (Map<String, String>) envs.get(environment);
        Iterator it = envCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
        }

        Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
        it = commonCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(capabilities.getCapability(pair.getKey().toString()) == null){
                capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
            }
        }
        Map<String, String> proxyHost = (Map<String, String>) config.get("proxySetting");
        it = proxyHost.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(capabilities.getCapability(pair.getKey().toString()) == null){
                capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
            }
        }

        String username = System.getenv("BROWSERSTACK_USERNAME");
        if(username == null) {
            username = (String) config.get("user");
        }

        String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
        if(accessKey == null) {
            accessKey = (String) config.get("key");
        }

        String app = System.getenv("BROWSERSTACK_APP_ID");
        if(app != null && !app.isEmpty()) {
            capabilities.setCapability("app", app);
        }

        if(capabilities.getCapability("browserstack.local") != null && capabilities.getCapability("browserstack.local") == "true"){
            l = new Local();
            Map<String, String> options = new HashMap<String, String>();
            options.put("key", accessKey);
            l.start(options);
        }

        driver = new RemoteWebDriver(new URL("http://"+username+":"+accessKey+"@"+config.get("server")+"/wd/hub"), capabilities);
    }

    // ==================================================
    // VARIABLES
    // ==================================================

//    private static SeleniumDriver instance;
//    protected static WebDriver driver;
//    private static Properties properties;
//    private static final Logger logger = LogManager.getLogger(SeleniumDriver.class);
//    private static final String USERNAME = "abassunday1";
//    private static final String AUTOMATE_KEY = "3MpMAGwobSbJQFnieLma";
//    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
//

    // TODO: Update the Listener Instance
    // TODO: Add some browser Instance for parallel testing

    // ==================================================
    // CLASS LOGIC
    // ==================================================

    private static void initialize() {

        reduceChromeDriverLogging();
        loadConfigFile();

        /**
         * This is getting the drivers path
         */
        String resourceFolderPath = System.getProperty("user.dir") + "\\resources\\testData\\";
        String chromePath = resourceFolderPath + "chromedriver.exe";
        String pathEdge = resourceFolderPath + "msedgedriver.exe";
        String pathFirefox = resourceFolderPath + "geckodriver.exe";
        String pathIe = resourceFolderPath + "IEDriverServer.exe";

        /**
         * This is setting the Chrome path
         */
//        System.setProperty("webdriver.chrome.driver", chromePath);
//        driver = new ChromeDriver();

        /**
         * This is setting and getting the window size
         */
        boolean forceSize = getBooleanFromConfig("BROWSER_FORCE_WINDOW_SIZE");

//        if (forceSize) {
//            int width = getIntFromConfig("BROWSER_WINDOW_WIDTH");
//            int height = getIntFromConfig("BROWSER_WINDOW_HEIGHT");
//            driver.manage().window().setSize(new Dimension(width, height));
//        }
//
//        //Utils.print("Browser size: " + driver.manage().window().getSize() + "[" + (forceSize ? "forced" : "not forced") + "]");
//
//        if (getBooleanFromConfig("RUN_BROWSER_MAXIMIZED")) {
//            driver.manage().window().maximize();
//        }
//        driver.manage().deleteAllCookies();
    }
    /**
     * Reduces number of ChromeDriver log output to the console,
     * makes console cleaner and easier to see important output.
     * Use with caution, it might disable important logs in case of crash etc.
     */
    private static void reduceChromeDriverLogging() {
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
    }

    private static void loadConfigFile() {
        try {
            properties = new Properties();
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void printTestDetails() {
        Utils.print("Starting test execution...");
        Utils.printSeparator();
        Utils.print("| Time stamp   | " + Utils.getTimeStamp());
        Utils.print("| Java version | " + Utils.getJavaVersion());
        Utils.printSeparator();
    }
    /**
     * Draws red border around element, useful for debuging.
     *
     * @param element that will have border around it
     */
    public void drawBorder(WebElement element) {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].style.border='3px solid red'", element);
        } catch (StaleElementReferenceException ignored) {

        }
    }

    public void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            String messages = "Unexpected InterruptedException";
            logger.log(org.apache.logging.log4j.Level.ERROR, messages, e);
        }
    }

    public void openMainPage() {
        driver.get(properties.getProperty("AUTH_ACCESS_LINK"));
        driver.navigate().to(properties.getProperty("REGISTER_LOGIN"));
    }

    public void openQuotePage() {
        driver.get(properties.getProperty("_EMAIL_LINK") + "/");
        driver.navigate().to("_EMAIL_LINK");
    }
    // ==================================================
    // GETTERS AND SETTERS
    // ==================================================

    public Properties getProperties() {
        return properties;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    /**
     * This method is used to switch and alert pop-up screen
     */

    public void switchToAlert() {
        Alert alert = driver.switchTo().alert();
        logger.info(alert.getText());
        alert.accept();
    }

    /**
     * This method is used to locate element on the web page that is in a specified state
     * and also wait till the expected condition is met
     */

    public WebElement getElement(By by, ElementState elementState, int timeOut) {
        switch (elementState) {
            case CLICKABLE:
                return driverWait(timeOut).until(ExpectedConditions.elementToBeClickable(by));
            case VISIBLE:
                return driverWait(timeOut).until(ExpectedConditions.visibilityOfElementLocated(by));
            case PRESENT:
                return driverWait(timeOut).until(ExpectedConditions.presenceOfElementLocated(by));
        }
        return null;
    }

    private WebDriverWait driverWait(int timeOut) {

        return new WebDriverWait(driver, timeOut);
    }

    public static Boolean getBooleanFromConfig(String propertyKey) {
        return Boolean.parseBoolean(properties.getProperty(propertyKey));
    }

    public static int getIntFromConfig(String propertyKey) {
        return Integer.parseInt(properties.getProperty(propertyKey));
    }

    // ==================================================
    // SINGLETON HOLDER
    // ==================================================

    public static BrowserStackHub getInstance() {
        if (instance == null) {
            instance = new BrowserStackHub();
        }
        return instance;
    }

    protected BrowserStackHub() {
        initialize();
    }

    public void onTestExecutionFinished() {
        if (getBooleanFromConfig("CLOSE_SELENIUM_ON_EXECUTION_FINISHED")) {
            driver.close();
        }
    }

    // ==================================================
    // INTERFACE IMPLEMENTATION
    // ==================================================

    public void get(String url) {
        driver.get(url);

    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public String getPageSource() {
        return driver.getPageSource();
    }

    public void close() {

    }

    public void quit() {

    }

    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    public WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }
    public WebDriver.Navigation ReNavigate() {
        return driver.navigate();
    }

    public WebDriver.Navigation navigate() {
        return driver.navigate();
    }

    public WebDriver.Options manage() {
        return driver.manage();
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
        if(l != null) l.stop();
    }

}
