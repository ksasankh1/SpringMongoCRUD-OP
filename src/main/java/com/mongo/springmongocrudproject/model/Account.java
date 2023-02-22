package com.mongo.springmongocrudproject.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {

    private String id;
    private String accountNumber;
    private String accountName;
    private String createTs;
    private String accountType;
    private String amount;
    private String bankAmount;
    private String bankAddr;
}
