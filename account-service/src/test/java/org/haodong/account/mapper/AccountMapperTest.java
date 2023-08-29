package org.haodong.account.mapper;

import org.haodong.account.AccountApp;
import org.haodong.dto.AccountDto;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = AccountApp.class)
@RunWith(SpringRunner.class)
class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;
    @Test
    void findAllAccounts() {
        List<AccountDto> allAccounts = accountMapper.findAllAccounts();
        System.out.println(allAccounts);
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