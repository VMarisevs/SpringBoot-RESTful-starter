package com.dublin.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;

@Configuration
@EnableGlobalAuthentication
public class AppSecurityConfig {

  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

    auth.inMemoryAuthentication() // in memory authentication configuration
        .withUser("user").password("password").roles("USER") // basic user
        .and() //
        .withUser("admin").password("password").roles("USER", "ADMIN");
  }
}
