package com.example.auth0app.controller;

import com.example.auth0app.AuthConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController {
    @Autowired
    private AuthConfig config;

    @Autowired
    private AuthenticationController authenticationController;
}
