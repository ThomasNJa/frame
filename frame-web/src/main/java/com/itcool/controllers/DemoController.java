package com.itcool.controllers;

import com.itcool.IServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;

@RestController
public class DemoController {

    @Autowired
    private IServiceDemo serviceDemo;

    @RequestMapping(value = "/")
    public void demo(HttpServletRequest request) {
        //        serviceDemo.demo();
        String user = request.getRemoteUser();
        String host = request.getRemoteHost();//最后一次握手时的IP
        String addr = request.getRemoteAddr();
        int port = request.getRemotePort();
        String xRealIp = request.getHeader("X-Real-IP");
        String xForwardFor = request.getHeader("X-Forwarded-For");
    }

}
