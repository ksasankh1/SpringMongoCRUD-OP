package com.mongo.springmongocrudproject.service;

import com.mongo.springmongocrudproject.DAO.AccountDAO;
import com.mongo.springmongocrudproject.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

@Autowired
    AccountDAO accountDaoImpl;

    public void saveAccount(Account account) {
       accountDaoImpl.save(account);
    }

    public Account getAccount(String actNum) {
        return accountDaoImpl.findByActNum(actNum);
    }

    public void updateAccount(Account account) {
        accountDaoImpl.save(account);
    }

    public void deleteAccount(String actNum) {
        accountDaoImpl.deleteByActNum(actNum);
    }
}

