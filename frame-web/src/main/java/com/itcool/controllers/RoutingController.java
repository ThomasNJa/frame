package com.itcool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoutingController {

    @RequestMapping(value = "/getView")
    public String getView() {
        return "index";
    }

}
