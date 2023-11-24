package com.example.profile.config;

import com.example.profile.props.ApplicationTokenPropertiesPresentCondition;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientConfiguration {
    @Bean("applicationRestClient")
    @Conditional(ApplicationTokenPropertiesPresentCondition.class)
    public RestTemplate applicationRestClient() {
        return new RestTemplateBuilder().build();
    }
}
