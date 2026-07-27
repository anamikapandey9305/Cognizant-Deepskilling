package com.cognizant.jwt.controller;

import com.cognizant.jwt.service.JwtService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.Map;

@RestController
public class AuthenticationController {


    private final JwtService jwtService;


    public AuthenticationController(JwtService jwtService) {
        this.jwtService = jwtService;
    }


    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(
            @RequestHeader("Authorization") String authorizationHeader) {

        System.out.println("AUTH HEADER: " + authorizationHeader);

        String encodedCredentials =
                authorizationHeader.substring(6);

        String decodedCredentials =
                new String(
                        Base64.getDecoder()
                                .decode(encodedCredentials)
                );

        System.out.println("DECODED: " + decodedCredentials);

        String username =
                decodedCredentials.split(":")[0];

        System.out.println("USERNAME: " + username);

        String token =
                jwtService.generateToken(username);

        return ResponseEntity.ok(
                Map.of("token", token)
        );

    }
}