package org.haodong.account.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;

@RestController
public class AccountController {
    @GetMapping("/info")
    public String info() {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        return "用户：" + name + " 进程：" + Thread.currentThread().getName();
    }
}
