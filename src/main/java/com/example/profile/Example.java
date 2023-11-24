package com.example.profile;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Example {
    private final RestTemplate applicationRestClient;

    public Example(@Qualifier("applicationRestClient") RestTemplate applicationRestClient) {
        this.applicationRestClient = applicationRestClient;
    }

    @PostConstruct
    public void message() {
        System.out.println("client available: " + (applicationRestClient != null));
    }
}
