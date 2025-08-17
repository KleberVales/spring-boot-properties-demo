package com.example.propertiesdemo.controller;

import com.example.propertiesdemo.config.AppConfigProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final AppConfigProperties appConfig;

    public MessageController(AppConfigProperties appConfig) {
        this.appConfig = appConfig;
    }

    // Usando @Value para injetar diretamente
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/message")
    public String getMessage() {
        return "Mensagem: " + appConfig.getMessage() +
                " | Versão: " + appConfig.getVersion() +
                " | Porta: " + serverPort;
    }
}
