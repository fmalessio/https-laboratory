package com.um.sistemasemergentes.httpslab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    // @PostMapping("/send")
    @GetMapping("/send")
    public String loadMessage() {
        return "OK";
    }

}
