package com.bushro.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan({"com.bushro.mall.mbg.mapper","com.bushro.mall.dao"})
@SpringBootApplication
public class MallJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallJwtApplication.class, args);
    }

}
