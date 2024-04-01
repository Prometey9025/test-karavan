package com.example.integration.config;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

public class SecondIntegration extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:java?period=1000")
                .log(LoggingLevel.INFO,"Second Integration");
    }
}
