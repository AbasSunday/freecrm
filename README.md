package utility;


import base.SeleniumDriver;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import utility.enumBase.PetType;
import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

import static utility.ExcelConstant.*;
import static utility.ExcelConstant.workbook;
import static utility.enumBase.PetType.CAT;
import static utility.enumBase.PetType.DOG;


public class Utils extends SeleniumDriver {

    private static final String TEST_DATA_SHEET = System.getProperty("user.dir") + "\\resources\\testData\\loginRegDetails.xlsx";
    private static Workbook book;

    private static Sheet sheet;
    private static XSSFWorkbook workbook;
    private static XSSFSheet workSheet;


    public Utils(String excelPath, String sheetName) throws IOException {
        File fileName = new File(excelPath);
        FileInputStream fileStream = new FileInputStream(fileName);
        workbook = new XSSFWorkbook(fileStream);
    }
    public static String getPetTypeName(PetType petType) {
        String type = "";

        switch (petType) {
            case DOG:
                type = "Dog";
                break;
            case CAT:
                type = "Cat";
                break;
            default:
                Assert.fail("Incorrect type of pet specified in the feature file!");
        }
        return type;
    }

    public static PetType getPetType(String petType) {
        if ("Dog".equals(petType)) {
            return DOG;
        } else if ("Cat".equals(petType)) {
            return CAT;
        } else {
            Assert.fail("Incorrect type of pet specified in the feature file!");
        }
        return null;
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void printSeparator() {
        print("========================================================");
    }

    public static String getCurrentDate(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.UK);
        return dateFormat.format(new Timestamp(System.currentTimeMillis()));

    }

    public static String getTimeStamp() {
        return getCurrentDate("dd MMMM yy, HH:mm");
    }

    public static String getJavaVersion() {
        return System.getProperty("java.version");
    }

    /**
     * @return This @DataProvider provides data to the @Test method by
     * reading the data from excel sheet
     * @throws IOException
     */
    @DataProvider
    public static Object[][] readExcelData() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file_location); //Excel sheet file location get mentioned here
        workbook = new XSSFWorkbook(fileInputStream);//get my workbook

        worksheet = workbook.getSheet(SheetName); // get my sheet from workbook
        XSSFRow Row = worksheet.getRow(0);//get my Row which start from 0

        int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
        int ColNum = Row.getLastCellNum(); // get last ColNum

        Object[][] Data = new Object[RowNum - 1][ColNum]; // pass my  count data in array

        for (int i = 0; i < RowNum - 1; i++) //Loop work for Rows
        {
            XSSFRow row = worksheet.getRow(i + 1);

            for (int j = 0; j < ColNum; j++) //Loop work for colNum
            {
                if (row == null)
                    Data[i][j] = "There is no data in that row";
                else {
                    XSSFCell cell = row.getCell(j);
                    if (cell == null)
                        Data[i][j] = "No data found"; //if it get Null value it pass no data
                    else {
                        String value = formatter.formatCellValue(cell);
                        Data[i][j] = value; //This formatter get my all values as string i.e integer, float all type data value
                    }
                }
            }
        }

        return Data;
    }


}


