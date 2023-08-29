package org.haodong.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;

@RestController
public class ProductController {
    @GetMapping("/info")
    public String info(){
        String name = ManagementFactory.getRuntimeMXBean().getName();
        return "商品：" + name + " 进程：" + Thread.currentThread().getName();
    }
}
