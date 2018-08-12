package com.qinjun.autotest.tstest.base;

import com.qinjun.autotest.tstest.cases.DemoCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class TestFactory {
    private final static Logger logger = LoggerFactory.getLogger(TestFactory.class);

    @Factory(dataProvider="dp")
    public Object[] createInstance(String envIp) {
        logger.info("Target env ip:"+envIp);
        return new Object[] {new DemoCase(envIp)};
    }


    @DataProvider(name="dp")
    public static Object[][] dataProvider() {
        String ipListStr = System.getProperty("ipList");
        logger.info("Target ip list string:"+ipListStr);
        String[] ips = ipListStr.split(",");

        Object[][] ipss = new Object[ips.length][1];

        for (int i=0;i<ips.length;i++) {
            String ip = ips[i];
            ipss[i][0] = ip;
        }
        return ipss;
    }

}
