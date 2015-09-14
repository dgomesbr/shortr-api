package com.diegomagalhaes.shortr.api.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Data
@RefreshScope
@ConfigurationProperties(prefix = "api")
@Configuration
public class APIProperties {
    private Config config;

    @Data
    public static class Config {
        private Blocked blocked;


        public static class Blocked {
            List<String> blockedExtensions = new ArrayList<>();

            public List<String> getBlockedExtensions() {
                return blockedExtensions;
            }

            public void setBlockedExtensions(List<String> blockedExtensions) {
                this.blockedExtensions = blockedExtensions;
            }
        }
    }
}
