public class ExcelReader {

    public static WebDriver driver;
    String chrome_path = "/Users/abas/Downloads/chromedriver";
    public static HSSFWorkbook workbook;
    public static HSSFSheet worksheet;
    public static DataFormatter formatter = new DataFormatter();
    public static String file_location = System.getProperty("user.dir") + "/Documents/FreeCRMTest/src/main/java/com/crm/testdata/FreeCrmTestData.xlsx";
    static String SheetName = "contacts";
    public String Res;
    //Write obj1 = new Write();
    public int DataSet = -1;

///Users/abas/Downloads/chromedriver

    @BeforeSuite
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", chrome_path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uat5.everypaw.com/portal/login/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @DataProvider
    public static Object[][] readExcelData() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file_location); //Excel sheet file location get mentioned here
        workbook = new HSSFWorkbook(fileInputStream); //get my workbook
        worksheet = workbook.getSheet(SheetName);// get my sheet from workbook
        HSSFRow Row = worksheet.getRow(0);     //get my Row which start from 0

        int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
        int ColNum = Row.getLastCellNum(); // get last ColNum

        Object Data[][] = new Object[RowNum - 1][ColNum]; // pass my  count data in array

        for (int i = 0; i < RowNum - 1; i++) //Loop work for Rows
        {
            HSSFRow row = worksheet.getRow(i + 1);

            for (int j = 0; j < ColNum; j++) //Loop work for colNum
            {
                if (row == null)
                    Data[i][j] = "";
                else {
                    HSSFCell cell = row.getCell(j);
                    if (cell == null)
                        Data[i][j] = ""; //if it get Null value it pass no data
                    else {
                        String value = formatter.formatCellValue(cell);
                        Data[i][j] = value; //This formatter get my all values as string i.e integer, float all type data value
                    }
                }
            }
        }

        return Data;
    }

    @Test //Test method
            (dataProvider="readExcelData") //It get values from ReadVariant function method

//Here my all parameters from excel sheet are mentioned.
        public void AddVariants(String title, String firstname, String lastname, String company) throws Exception

    {

        driver.findElement(By.xpath("//*[@id='registerForm']/div[1]/fieldset/div[1]/label")).click();
        driver.wait();

        driver.findElement(By.id("emailAddress")).sendKeys(title);
        System.out.println("NAme of product available are:" +title);


        driver.findElement(By.id("postCode")).sendKeys(firstname);
        System.out.println("Weight for products are:" +firstname);

        driver.findElement(By.id("daySelectDob")).sendKeys(lastname);
        System.out.println("Volume of product are:" +lastname);

        driver.findElement(By.id("monthSelectDob")).sendKeys(lastname);
        driver.findElement(By.id("yearSelectDob")).sendKeys(lastname);


        driver.findElement(By.id("createPassword")).sendKeys(company);
        System.out.println("Description quotation are:" +company);


    }
    @AfterClass
    public void tearDown(){

        driver.close();
    }
}
