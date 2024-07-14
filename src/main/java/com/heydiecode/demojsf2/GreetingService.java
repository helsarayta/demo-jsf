package com.heydiecode.demojsf2;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String getGreetingTemplate(String language) {
        return "Hello %s";
    }
}
