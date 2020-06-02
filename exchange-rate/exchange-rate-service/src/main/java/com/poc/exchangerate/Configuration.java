package com.poc.exchangerate;

import com.poc.restclient.api.LatestRatesApi;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public LatestRatesApi getSomething() {
        return new LatestRatesApi();
    }
}
