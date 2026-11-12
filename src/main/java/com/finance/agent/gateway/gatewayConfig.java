package com.finance.agent.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class gatewayConfig {

    @Bean
    public RouteLocator buildRouteLocator(RouteLocatorBuilder builder){
        System.out.println("Gate way passed");
        return builder.routes().route(r -> r.path("/**").uri("https://finance-agent-yxjb.onrender.com")).build();
    }
}
