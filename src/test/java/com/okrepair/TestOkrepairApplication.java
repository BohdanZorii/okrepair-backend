package com.okrepair;

import org.springframework.boot.SpringApplication;

public class TestOkrepairApplication {

    public static void main(String[] args) {
        SpringApplication.from(OkrepairApplication::main).with(TestcontainersConfiguration.class)
                .run(args);
    }

}
