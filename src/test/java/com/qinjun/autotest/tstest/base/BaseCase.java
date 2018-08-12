package com.qinjun.autotest.tstest.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Map;

public class BaseCase extends BaseSuite {
    private final static Logger logger = LoggerFactory.getLogger(BaseCase.class);
    protected String url ;
    protected String envIp;

    public BaseCase() {
    }

    public BaseCase(String envIp) {
        this.envIp = envIp;
    }


    @BeforeClass(alwaysRun=true)
    public void beforeClass() {
        logger.info("==========[Start Class]==========");
        Map<String,String> urlMap = UrlFactory.getUrl(envIp);
        url = urlMap.get(UrlFactory.name);
    }


    @AfterClass(alwaysRun=true)
    public void afterClass() {
        logger.info("==========[End Class]==========");
    }

    @BeforeMethod(alwaysRun=true)
    public void setup() {
        logger.info("==========[Start Case]==========");
    }


    @AfterMethod(alwaysRun=true)
    public void cleanup() {
        logger.info("==========[End Case]==========");
    }
}