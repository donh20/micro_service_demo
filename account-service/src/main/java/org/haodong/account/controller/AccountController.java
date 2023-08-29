package org.haodong.account.controller;


import org.haodong.account.mapper.AccountMapper;
import org.haodong.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountMapper accountMapper;
    @GetMapping("/info")
    public String info() {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        return "用户：" + name + " 进程：" + Thread.currentThread().getName();
    }

    @GetMapping("/accounts")
    public List<AccountDto> findAllAccounts() {
        return accountMapper.findAllAccounts();
    }

    @GetMapping("/accounts/{id}")
    public AccountDto findAccountById(@PathVariable("id") int id) {
        return accountMapper.findAccountById(id);
    }

}
