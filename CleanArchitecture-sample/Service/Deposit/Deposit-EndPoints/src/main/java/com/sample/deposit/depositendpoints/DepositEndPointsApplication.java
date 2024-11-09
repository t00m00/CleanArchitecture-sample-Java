package com.sample.deposit.depositendpoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.sample.deposit", "com.sample.deposit.depositapplication.deposit.interfaces" })
public class DepositEndPointsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepositEndPointsApplication.class, args);
    }

}