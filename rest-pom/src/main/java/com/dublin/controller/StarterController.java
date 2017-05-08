package com.dublin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {

  @RequestMapping("/greeting")
  public ResponseEntity<String> greeting(
      @RequestParam(value = "name", defaultValue = "World") String name) {

    return ResponseEntity.ok().body("yeah");
  }
}
