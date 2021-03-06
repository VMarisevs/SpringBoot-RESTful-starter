package com.dublin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dublin.security.annotations.AllowedRole;

@RestController
public class StarterController {

  @RequestMapping("/greeting")
  public ResponseEntity<String> greeting(
      @RequestParam(value = "name", defaultValue = "World") String name) {

    return ResponseEntity.ok().body("yeah");
  }

  @AllowedRole
  @RequestMapping("/greeting/{role}")
  public ResponseEntity<String> greetingRole(@PathVariable String role,
      @RequestParam(value = "name", defaultValue = "World") String name) {

    return ResponseEntity.ok().body("yeah");
  }
}
