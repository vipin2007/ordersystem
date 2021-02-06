package com.paytack.ordersystem.repository;

import com.paytack.ordersystem.model.PaytackUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaytackUserRepository extends CrudRepository<PaytackUser,Integer> {
    List<PaytackUser> findAll();

}
