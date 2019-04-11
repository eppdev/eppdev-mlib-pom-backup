/* FileName: Application.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By 996 License 1.0
 */

package cn.eppdev.mlib.reg.logistic.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jinlong.hao
 */
@SpringBootApplication
public class Application {
    static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
