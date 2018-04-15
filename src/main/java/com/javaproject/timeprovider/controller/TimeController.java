package com.javaproject.timeprovider.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping(value = "/")
public class TimeController {


    private static final Logger logger = Logger.getLogger(TimeController.class);

    @RequestMapping(method = RequestMethod.GET)
    String getTime() {
        logger.info("WOHOOO! SOMEBODY CALLED ME!");
        return ("The exact time on pod " + System.getenv("HOSTNAME") + " is: " + String.valueOf(LocalTime.now()));
    }
}
