package com.lin.kumedia;

import javax.annotation.PostConstruct;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.info.BuildProperties;


@SpringBootApplication
@MapperScan("com.lin.kumedia.sql.mapper")
public class KuMediaApplication {
    
    private static Logger logger = LoggerFactory.getLogger(KuMediaApplication.class);
    
    @Autowired
    private BuildProperties buildProperties;
    
    public static void main(String[] args) {
        SpringApplication.run(KuMediaApplication.class, args);
    }

    @PostConstruct
    private void init() {
        logger.info(buildProperties.getVersion());
    }

}
