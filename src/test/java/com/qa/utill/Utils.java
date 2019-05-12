package com.qa.utill;

import com.qa.utill.enums.PetType;
import org.junit.Assert;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Utils
{
    public static String getPetTypeName(PetType petType)
    {
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

    public static PetType getPetType(String petType)
    {
        switch (petType)
        {
            case "Dog":
                return PetType.DOG;
            case "Cat":
                return PetType.CAT;
            default:
                Assert.fail("Incorrect type of pet specified in the feature file!");

        }
        return null;
    }

    public static void print(String msg)
    {
        System.out.println(msg);
    }

    public static void printSeparator()
    {
        print("========================================================");
    }

    public static String getCurrentDate(String format)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.UK);
        return dateFormat.format(new Timestamp(System.currentTimeMillis()));
    }

    public static String getTimeStamp()
    {
        return getCurrentDate("dd MMMM yy, HH:mm");
    }

    public static String getJavaVersion()
    {
        return System.getProperty("java.version");
    }
}
