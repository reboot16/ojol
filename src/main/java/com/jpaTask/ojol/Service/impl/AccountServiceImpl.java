package com.jpaTask.ojol.Service.impl;

import com.jpaTask.ojol.Repository.AccountRepository;
import com.jpaTask.ojol.Service.AccountService;
import com.jpaTask.ojol.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account findById(BigInteger id) {
        return accountRepository.findById(id);
    }

    @Override
    public List<Account> findAll() {
        List<Account> accounts = accountRepository.findAll();
        return accounts;
    }

    @Override
    public Account add(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void update(BigInteger id, Account account) {
        Account account1 = accountRepository.findById(id);
        if(account1!=null)
            accountRepository.save(account);
    }
}
