package org.haodong.account.mapper;

import org.haodong.dto.AccountDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;
    @Test
    void findAllAccounts() {
        List<AccountDto> allAccounts = accountMapper.findAllAccounts();
    }

    @Test
    void findAccountById() {
        AccountDto accountById = accountMapper.findAccountById(1);
        System.out.println(accountById);
    }

    @Test
    void processBalance() {
        int i = accountMapper.processBalance(1, 100);
        System.out.println(i);
    }
}