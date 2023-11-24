package com.example.profile.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

@ConfigurationProperties("api.token")
public class ApplicationTokenProperties {
    private final Integer refreshInterval;

    // doesn't work on Spring Boot 3.2.0
    @ConstructorBinding
    public ApplicationTokenProperties(Integer refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    public Integer getRefreshInterval() {
        return refreshInterval;
    }
}
