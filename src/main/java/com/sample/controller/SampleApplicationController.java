package com.sample.controller;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2/2/18.
 */
@RestController
public class SampleApplicationController {

    private final static Logger logger = Logger.getLogger(SampleApplicationController.class);

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String simpleGetMethod(@RequestParam("param1") String param1,@RequestParam("param2") String parram2) {
        logger.info("Request received with parameters " + param1 + " " + parram2);
        JSONObject response = new JSONObject();
        response.put("status","Success");
        response.put("data",param1 + " " + parram2);

        return response.toString();
    }
}
