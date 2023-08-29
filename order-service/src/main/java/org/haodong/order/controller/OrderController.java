package org.haodong.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {
    @GetMapping("/info")
    Map<String, String> info(){
        HashMap<String, String> map = new HashMap<>();
        return map;
    }
}
