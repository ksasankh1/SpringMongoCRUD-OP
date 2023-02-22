package com.mongo.springmongocrudproject.controller;

import com.mongo.springmongocrudproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<String> saveAccountDetails(){
        //TODO

        return null;
    }
}
