package com.qinjun.autotest.tstest.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseSuite {
    private final static Logger logger = LoggerFactory.getLogger(BaseSuite.class);
    protected static String url = null;

    @BeforeSuite(alwaysRun=true)
    public void beforeSuite() {
        logger.info("==========[Start Suite]==========");
    }

    @AfterSuite(alwaysRun=true)
    public void afterSuite() {
        logger.info("==========[End Suite]==========");
    }
}