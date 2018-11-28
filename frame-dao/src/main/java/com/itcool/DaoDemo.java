package com.itcool;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public class DaoDemo implements IDaoDemo {

    @Override
    @Select("SELECT * FROM JIU_commodity")
    public void demo() {
        System.out.println("进入dao层...");
    }
}
