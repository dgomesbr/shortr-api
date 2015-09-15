package com.diegomagalhaes.shortr.api.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.ArrayList;
import java.util.List;

@Data
@RefreshScope
@ConfigurationProperties(prefix = "api")
public class APIProperties {
    private Config config;

    @Data
    public static class Config {
        private Blocked blocked;

        @Data
        public static class Blocked {
            List<String> extensions = new ArrayList<>();
        }
    }
}
