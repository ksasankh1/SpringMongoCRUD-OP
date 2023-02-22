package com.mongo.springmongocrudproject.controller;

import com.mongo.springmongocrudproject.model.Account;
import com.mongo.springmongocrudproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/saveAccountDetails")
    public ResponseEntity<String> saveAccountDetails(@RequestBody Account account){
        if(Objects.nonNull(account)){
            accountService.saveAccount(account);
            return new ResponseEntity<>("input request accepted successfully",HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>("input request not valid", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getAccountDetails/{actNum}")
    public ResponseEntity<Object> getAccountDetails(@PathVariable("actNum") String actNum){
        if(Objects.nonNull(actNum)){
            Account account = accountService.getAccount(actNum);
            return new ResponseEntity<>(account,HttpStatus.OK);
        }else{
            return new ResponseEntity("Given Account Number is not valid",HttpStatus.BAD_REQUEST);
        }
    }

    @PatchMapping("/updateAccountDetails")
    public ResponseEntity<Object> updateAccountDetails(@RequestBody Account account){
        if(Objects.nonNull(account)){
            accountService.updateAccount(account);
            return new ResponseEntity<>("input request successfully Updated",HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>("input request not valid", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/deleteAccount/{actNum}")
    public ResponseEntity<String> deleteAccount(@PathVariable("actNum")String actNum){
        if(Objects.nonNull(actNum)){
            accountService.deleteAccount(actNum);
            return new ResponseEntity<>("Account Details deleted for the given Account Number",HttpStatus.OK);
        }else{
            return new ResponseEntity("Given Account Number is not valid",HttpStatus.BAD_REQUEST);
        }

    }

}
