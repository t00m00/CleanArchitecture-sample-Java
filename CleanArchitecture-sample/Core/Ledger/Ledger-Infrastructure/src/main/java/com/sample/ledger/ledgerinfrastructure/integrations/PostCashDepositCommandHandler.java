package com.sample.ledger.ledgerinfrastructure.integrations;


import com.sample.ledger.ledgerapplication.cashdeposit.commands.CashDepositCommand;
import com.sample.ledger.ledgerapplication.cashdeposit.dtos.CashDepositResponseDto;
import com.sample.ledger.ledgerapplication.cashdeposit.interfaces.CashDepositCommandHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

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
