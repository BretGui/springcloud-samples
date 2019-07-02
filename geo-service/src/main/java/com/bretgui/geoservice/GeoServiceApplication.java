package com.bretgui.geoservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.bretgui.geoservice.config",
        "com.bretgui.geoservice.*.service",
        "com.bretgui.geoservice.*.controller"
})
public class GeoServiceApplication {

    private static Logger logger = LoggerFactory.getLogger(GeoServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(GeoServiceApplication.class, args);
        logger.info("=========================启动成功=========================");
    }

}
