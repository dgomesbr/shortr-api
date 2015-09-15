package com.diegomagalhaes.shortr;

import com.diegomagalhaes.shortr.api.configuration.APIProperties;
import com.diegomagalhaes.shortr.api.configuration.AsyncProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableConfigurationProperties({AsyncProperties.class, APIProperties.class})
public class ShortrConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortrConfigApplication.class, args);
    }


}
