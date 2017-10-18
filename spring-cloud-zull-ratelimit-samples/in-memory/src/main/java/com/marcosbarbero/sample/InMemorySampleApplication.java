package com.marcosbarbero.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Marcos Barbero
 * @since 2017-10-18
 */
@EnableZuulProxy
@SpringBootApplication
public class InMemorySampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(InMemorySampleApplication.class, args);
    }
}
