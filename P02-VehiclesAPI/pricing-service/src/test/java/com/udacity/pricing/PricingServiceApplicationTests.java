package com.udacity.pricing;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration
class PricingServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    @Bean
    public MockMvc mockMvc(){
        return null;
    };

}
