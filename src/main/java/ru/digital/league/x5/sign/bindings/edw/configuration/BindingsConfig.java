package ru.digital.league.x5.sign.bindings.edw.configuration;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BindingsConfig {

    @Value("${sap-pi-basic-login}")
    private String login;

    @Value("${sap-pi-basic-password}")
    private String password;

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(login, password);
    }

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}