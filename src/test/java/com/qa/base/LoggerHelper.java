package com.qa.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

public class LoggerHelper {


    private static Logger logger;



    public static Logger getLogger(Class cls) {

        if (logger == null) {

            LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
            File file = new File( System.getProperty("user.dir") + "/resources/log4j.properties");

            context.setConfigLocation(file.toURI());

            return logger.info("");
        }
        return logger;
    }

}
