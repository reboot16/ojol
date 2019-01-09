package com.jpaTask.ojol.Service;

import com.jpaTask.ojol.model.Account;

import java.math.BigInteger;
import java.util.List;

public interface AccountService {

    Account findById(BigInteger id);
    List<Account> findAll();
    Account add(Account account);
    void update(BigInteger id, Account account);

}
