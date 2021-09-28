package com.lioyan.jul;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * {@link Test1}
 *
 * @author com.lioyan
 * @date 2021/9/28  13:50
 */
public class Test1 {

    public static void main(String[] args) {
        System.setProperty("java.util.logging.config.file", Test1.class.getClassLoader().getResource("logging.properties").getPath());
        Logger logger = Logger.getLogger("com.leon.JULTest");
        Logger logger2 = Logger.getLogger("com.leon");
        Logger logger3 = Logger.getLogger("com");
        // 2.日志记录输出
        logger.info("hello jul");

        // 通用方法进行日志记录
        logger.log(Level.INFO, "info msg");


        // 通过占位符 方式输出变量值
        String name = "leon";
        Integer age = 13;
        logger.log(Level.INFO, "用户信息：{0},{1}", new Object[]{name, age});


    }

}
