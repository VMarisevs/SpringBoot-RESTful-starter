package com.dublin.security.expression;

import org.springframework.security.access.expression.SecurityExpressionRoot;
import org.springframework.security.access.expression.method.MethodSecurityExpressionOperations;
import org.springframework.security.core.Authentication;

public class CustomMethodSecurityExpressionRoot extends SecurityExpressionRoot
    implements
      MethodSecurityExpressionOperations {

  public CustomMethodSecurityExpressionRoot(Authentication authentication) {
    super(authentication);
  }

  public boolean hasSpecialRole(String role) {
    return role.equals("special_role");
  }

  @Override
  public void setFilterObject(Object filterObject) {}

  @Override
  public Object getFilterObject() {
    return null;
  }

  @Override
  public void setReturnObject(Object returnObject) {}

  @Override
  public Object getReturnObject() {
    return null;
  }

  @Override
  public Object getThis() {
    return null;
  }

}
