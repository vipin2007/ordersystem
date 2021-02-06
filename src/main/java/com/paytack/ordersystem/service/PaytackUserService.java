package com.paytack.ordersystem.service;

import com.paytack.ordersystem.model.PaytackUser;

import java.util.List;

public interface PaytackUserService {
    List<PaytackUser> findAllUser();
}
