package org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

// this annotation marks this class as containing the metadata Spring needs to configure the container
@Configuration

// this annotation instructs Spring to scan for classes annotated with @Component
@ComponentScan
public class AppContextConfig {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);


    }}
