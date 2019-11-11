package com.um.sistemasemergentes.httpslab.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emergentes")
public class MessageController {

    @PostMapping("/message")
    public String getMessage(@RequestBody String clientMsg) {
        return "Mensaje recibido correctamente: " + clientMsg;
    }

}