package com.paytack.ordersystem.controller;

import com.paytack.ordersystem.model.PaytackUser;
import com.paytack.ordersystem.service.PaytackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaytackController {
    @Autowired
    PaytackUserService paytackUserService;

    @RequestMapping("/alluser")
    public List<PaytackUser> paytack() {
        return paytackUserService.findAllUser();
    }
}
