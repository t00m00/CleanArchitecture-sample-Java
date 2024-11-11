package com.sample.ledger.ledgerendpoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.sample.ledger", "com.sample.ledger.ledgerapplication.cashdeposit.interfaces"})
public class DepositEndPointsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepositEndPointsApplication.class, args);
    }

}