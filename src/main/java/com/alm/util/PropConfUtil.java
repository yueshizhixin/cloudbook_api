package com.alm.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-29 20:26</p>
 * <p>desc: 读取配置文件</p>
 */
public class PropConfUtil {
    private static Properties properties;
    private static InputStream inputStream;

    private PropConfUtil() {
    }

    private static void initializeCheck() {
        if (properties == null) {
            properties = new Properties();
        }
        if (inputStream == null) {
            inputStream = PropConfUtil.class.getResourceAsStream("/conf.properties");
        }
    }

    public static String getValue(String key) {
        try {
            initializeCheck();
            properties.load(inputStream);
            return properties.getProperty(key, null);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获取jwt过期小时数
     */
    public static Integer expHours() {
        try {
            initializeCheck();
            properties.load(inputStream);
            return Integer.parseInt(properties.getProperty("expHours", null));
        } catch (Exception e) {
            return null;
        }
    }

}
