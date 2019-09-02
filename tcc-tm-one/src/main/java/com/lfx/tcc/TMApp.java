package com.lfx.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * @author <a href="mailto:idler41@163.com">idler41</a>
 * @date 2019-08-15 19:32
 */
@SpringBootApplication(scanBasePackages = "com.lfx.tcc")
@ImportResource({"seata-tcc.xml", "seata-dubbo-reference.xml"})
public class TMApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TMApp.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TMApp.class);
    }
}
