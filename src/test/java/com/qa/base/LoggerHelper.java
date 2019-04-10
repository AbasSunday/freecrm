package com.qa.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

public class LoggerHelper {


    private static Logger logger = LogManager.getLogger(LoggerHelper.class);
    private static boolean root = false;



    public static Logger getLogger(Class cls) {

        if (root) {

            LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
            File file = new File("/Users/abas/Documents/freecrm/resource/log4j.properties");
            context.setConfigLocation(file.toURI());
            root = true;
            return LoggerHelper.getLogger(cls);
        }
        return LoggerHelper.getLogger(cls);
    }

    public static void main(String[] args) {
        Logger log = LoggerHelper.getLogger(Logger.class);
        log.info("Logger is configured");
        log.info("Logger is configured");
        log.info("Logger is configured");


    }

}
