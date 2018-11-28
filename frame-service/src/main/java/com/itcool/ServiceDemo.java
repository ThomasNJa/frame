package com.itcool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServiceDemo implements IServiceDemo {

    @Autowired
    private IDaoDemo daoDemo;

    @Override
    public void demo() {
        System.out.println("进入service层...");
        daoDemo.demo();
    }
}
