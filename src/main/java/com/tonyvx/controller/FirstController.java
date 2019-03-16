package com.tonyvx.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class FirstController {
    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public HashMap<String, String> hello(@PathVariable String id) {
        HashMap<String, String> response = new HashMap<>();
        response.put("hello", id);
        return response;
    }
}