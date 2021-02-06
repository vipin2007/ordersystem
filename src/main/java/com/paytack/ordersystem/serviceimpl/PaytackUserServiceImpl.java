package com.paytack.ordersystem.serviceimpl;

import com.paytack.ordersystem.model.PaytackUser;
import com.paytack.ordersystem.repository.PaytackUserRepository;
import com.paytack.ordersystem.service.PaytackUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("paytackUserService")
public class PaytackUserServiceImpl implements PaytackUserService {
    private static final Logger LOG = LoggerFactory.getLogger(PaytackUserServiceImpl.class);

    @Autowired
    PaytackUserRepository paytackUserRepository;

    @Override
    public List<PaytackUser> findAllUser() {
        return paytackUserRepository.findAll();
    }
}
