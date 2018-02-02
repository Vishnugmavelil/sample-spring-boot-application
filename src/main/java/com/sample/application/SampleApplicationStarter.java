package com.sample.application;

import com.sample.controller.SampleApplicationController;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by dell on 2/2/18.
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = SampleApplicationController.class)
public class SampleApplicationStarter {

    private final static Logger logger = Logger.getLogger(SampleApplicationStarter.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        logger.info("Starting Sample Spring-Boot Application...........");
        SpringApplication.run(SampleApplicationStarter.class, args);
    }
}
