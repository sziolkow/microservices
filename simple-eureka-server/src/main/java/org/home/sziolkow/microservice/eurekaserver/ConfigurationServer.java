package org.home.sziolkow.microservice.eurekaserver;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfigurationServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigurationServer.class).web(true).run(args);
    }
}
