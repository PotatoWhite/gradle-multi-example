package me.potato.library.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MyService {
    private final ServiceProperties properties;

    public MyService(ServiceProperties serviceProperties) {
        this.properties = serviceProperties;
    }

    public String message() {
        return this.properties.getMessage();
    }
}
