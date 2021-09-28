package com.lioyan.log4j;

import org.apache.log4j.Logger;

/**
 * {@link Test1}
 *
 * @author com.lioyan
 * @date 2021/9/28  16:48
 */

public class Test1 {
    private static Logger logger = Logger.getLogger(Test1.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println("This is println message.");

        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }
}

