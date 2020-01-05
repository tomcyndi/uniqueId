package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by kangkang on 17/8/6.
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.*"})
public class App {

    public static void main(String[] args) throws Exception {
        //SpringApplication.run(App.class, args);
        new SpringApplicationBuilder(
                App.class)
                .web(true).run(args);
    }
}
