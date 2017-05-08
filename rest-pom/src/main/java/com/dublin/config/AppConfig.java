package com.dublin.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan({"com.dublin.controller", "com.dublin.security"})
public class AppConfig {

}
