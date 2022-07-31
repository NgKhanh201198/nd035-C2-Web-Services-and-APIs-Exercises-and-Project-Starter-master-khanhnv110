package com.udacity.pricing.api;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.web.servlet.MockMvc;

@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced // Load balance between service instances running at different ports.
    public TestRestTemplate testRestTemplate() {
        return new TestRestTemplate();
    }

//    @Bean
//    public MockMvc mockMvc(){
//
//    }
}
