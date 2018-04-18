package com.javaproject.timeprovider.controller;

import org.apache.log4j.Logger;
import org.json.JSONObject;
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
        logger.info("Application received " + RequestMethod.GET + " request on url: /");
        String response = new JSONObject()
                .put("time", String.valueOf(LocalTime.now()))
                .put("pod", System.getenv("HOSTNAME"))
                .put("cluster-ip", System.getenv("CLUSTER-IP"))
                .toString();
        return response;
    }
}
