package com.glad.oauth.web;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public Authentication index(Authentication authentication) {
        // TODO WARNING! Do not do this as authentication may contain sensitive information
        return authentication;
    }

}
