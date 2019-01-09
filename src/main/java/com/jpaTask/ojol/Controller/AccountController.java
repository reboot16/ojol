package com.jpaTask.ojol.Controller;

import com.jpaTask.ojol.Service.AccountService;
import com.jpaTask.ojol.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/account/{id}")
    public Account getAccountById(@PathVariable(name = "id") BigInteger id)
    {
        return accountService.findById(id);
    }

    @GetMapping("/account")
    public List<Account> getAllAccount()
    {
        return accountService.findAll();
    }

    @PostMapping("/account")
    public Account addAccount(@Valid @RequestBody Account account)
    {
        return accountService.add(account);
    }

    @PutMapping("/account/{id}")
    public void updateAccount(@PathVariable BigInteger id ,@Valid @ModelAttribute Account account)
    {
        accountService.update(id,account);
    }

}
