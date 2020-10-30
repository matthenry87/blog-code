package com.matthery87.blogcode.resttemplatelogging;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateLoggingConfig {

    @Bean
    RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {

        return restTemplateBuilder
                .rootUri("https://www.google.com")
//                .interceptors(new LoggingInterceptor())
                .build();
    }

}