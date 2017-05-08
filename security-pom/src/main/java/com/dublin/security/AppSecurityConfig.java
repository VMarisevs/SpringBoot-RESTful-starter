package com.dublin.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

import com.dublin.security.expression.CustomMethodSecurityExpressionHandler;
import com.dublin.security.permission.PermissionEvaluatorImpl;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AppSecurityConfig extends GlobalMethodSecurityConfiguration {

  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

    auth.inMemoryAuthentication() // in memory authentication configuration
        .withUser("user").password("password").roles("USER") // basic user
        .and() //
        .withUser("admin").password("password").roles("USER", "ADMIN");
  }

  @Override
  protected MethodSecurityExpressionHandler createExpressionHandler() {

    CustomMethodSecurityExpressionHandler expressionHandler =
        new CustomMethodSecurityExpressionHandler();
    expressionHandler.setPermissionEvaluator(new PermissionEvaluatorImpl());

    return expressionHandler;
  }
}
