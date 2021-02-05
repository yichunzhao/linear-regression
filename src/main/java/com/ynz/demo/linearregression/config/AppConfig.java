package com.ynz.demo.linearregression.config;

import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.DecimalFormat;

@Configuration
public class AppConfig {

    @Bean
    public SimpleRegression getSimpleRegression() {
        return new SimpleRegression();
    }

    @Bean
    public DecimalFormat getDecimalFormat() {
        return new DecimalFormat("#.##");
    }
}
