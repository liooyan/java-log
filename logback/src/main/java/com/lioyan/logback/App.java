package com.lioyan.logback;

/**
 * {@link App}
 *
 * @author com.lioyan
 * @date 2021/9/29  13:43
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 */
public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.error("logback 成功了");
        logger.debug("logback 成功了");
    }
}