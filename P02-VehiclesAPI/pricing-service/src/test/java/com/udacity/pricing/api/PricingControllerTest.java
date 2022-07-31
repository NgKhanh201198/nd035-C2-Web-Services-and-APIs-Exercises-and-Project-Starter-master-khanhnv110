package com.udacity.pricing.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.net.URI;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
public class PricingControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getPrice() throws Exception {

        /**
         * TODO: Add a test to check that the `get` method works by calling
         *
         */
        MvcResult result = this.mockMvc.perform(get(new URI("/services/price?vehicleId=1"))).andExpect(status().isOk()).andDo(print()).andReturn();
        String cars = result.getResponse().getContentAsString();
        System.out.printf(cars);
    }
}
