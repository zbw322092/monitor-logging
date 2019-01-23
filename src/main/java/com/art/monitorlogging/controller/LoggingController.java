package com.art.monitorlogging.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

  private static final Logger logger = LogManager.getLogger(LoggingController.class.getName());

  @RequestMapping("/")
  public String index() {
    logger.trace("A track message");
    logger.debug("A debug message");
    logger.info("A info message");
    logger.warn("A warn message A warn message A warn messageA warn messageA warn messageA warn messageA warn message");
    logger.error("An error messageAn error messageAn error messageAn error messageAn error messageAn error messageAn error message");

    return "Check out the logssssss";
  }
}
