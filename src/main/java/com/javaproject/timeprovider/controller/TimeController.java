package com.javaproject.timeprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping(value = "/")
public class TimeController {

    @RequestMapping(method = RequestMethod.GET)
    String getTime() {
        return (The time is: "+ String.valueOf(LocalTime.now()))
    }
}
