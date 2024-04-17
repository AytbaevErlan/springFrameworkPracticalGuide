package com.itbulls.learnit.spring.core.ioc.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class User4 {
    @Autowired
    private List<String> orderIds;

    public User4(){

    }

    public User4(List<String> orderIds){

        this.orderIds = orderIds;
    }

    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }
}
