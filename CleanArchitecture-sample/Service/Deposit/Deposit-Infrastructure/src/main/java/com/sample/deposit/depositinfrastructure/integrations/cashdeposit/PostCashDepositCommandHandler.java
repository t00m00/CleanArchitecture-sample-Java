package com.sample.deposit.depositinfrastructure.integrations.cashdeposit;


import com.sample.deposit.depositapplication.cashdeposit.commands.CashDepositCommand;
import com.sample.deposit.depositapplication.cashdeposit.dtos.CashDepositResponseDto;
import com.sample.deposit.depositapplication.cashdeposit.interfaces.CashDepositCommandHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Component
public class PostCashDepositCommandHandler implements CashDepositCommandHandler {
    private static final Logger log = LoggerFactory.getLogger(PostCashDepositCommandHandler.class);

    @Override
    public Optional<CashDepositResponseDto> handle(CashDepositCommand command) {
        log.info("✅✅Handling cash deposit command");

        // Use Case
        // T.B.D


        return Optional.of(new CashDepositResponseDto());
    }
}
