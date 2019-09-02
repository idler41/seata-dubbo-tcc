package com.lfx.tcc;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

/**
 * @author <a href="mailto:idler41@163.com">idler41</a>
 * @date 2019-08-19 13:48:57
 */
@SpringBootApplication(scanBasePackages = "com.lfx.tcc")
@ImportResource({"seata-tcc.xml", "seata-dubbo-provider.xml"})
public class TwoApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TwoApp.class).web(WebApplicationType.NONE).run(args);
    }
}
