package de.mindmatters.kennenlerntag.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @RequestMapping(value = "/api/v1/data/public/*")
    public String getPublicData() {
        return "Public Data : ";
    }

    @RequestMapping(value = "/api/v1/data/private/*")
    public String getPrivateData() {
        return "Private Data : ";
    }

}
