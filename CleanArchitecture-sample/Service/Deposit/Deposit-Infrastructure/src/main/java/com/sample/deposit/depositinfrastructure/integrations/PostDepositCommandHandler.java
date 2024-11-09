package com.sample.deposit.depositinfrastructure.integrations;


import com.sample.deposit.depositapplication.deposit.commands.DepositCommand;
import com.sample.deposit.depositapplication.deposit.dtos.DepositResponseDto;
import com.sample.deposit.depositapplication.deposit.interfaces.DepositCommandHandler;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

import java.util.Optional;

//@RequiredArgsConstructor(onConstructor_ = @Autowired)
//@Component
public class PostDepositCommandHandler implements DepositCommandHandler {
    @Override
    public Optional<DepositResponseDto> handle(DepositCommand command) {
        System.out.println("😬😬😬Deposit command handled");
        return Optional.of(new DepositResponseDto());
    }
}
