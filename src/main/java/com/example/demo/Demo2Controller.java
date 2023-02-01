package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/api2")
public class Demo2Controller {
    @GetMapping
    public ResponseEntity<String> getStringHello() throws UnknownHostException {
        return ResponseEntity.ok("Demo2: "+InetAddress.getLocalHost().getHostName());
    }
}
