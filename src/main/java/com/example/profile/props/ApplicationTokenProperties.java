package com.example.profile.props;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("api.token")
public class ApplicationTokenProperties {
    private Integer refreshInterval;

    public Integer getRefreshInterval() {
        return refreshInterval;
    }

    // works on Spring Boot 3.2.0
    public void setRefreshInterval(Integer refreshInterval) {
        this.refreshInterval = refreshInterval;
    }
}
