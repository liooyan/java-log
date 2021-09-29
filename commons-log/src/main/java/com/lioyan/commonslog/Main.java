package com.lioyan.commonslog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * {@link Main}
 *
 * @author com.lioyan
 * @date 2021/9/29  14:57
 */
public class Main {

    private static Log log = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        log.info("start...");
        log.warn("end.");
    }
}
