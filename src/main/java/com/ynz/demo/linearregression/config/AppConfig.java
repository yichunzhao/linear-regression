package com.ynz.demo.linearregression.config;

import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SimpleRegression getSimpleRegression() {
        return new SimpleRegression();
    }
}
