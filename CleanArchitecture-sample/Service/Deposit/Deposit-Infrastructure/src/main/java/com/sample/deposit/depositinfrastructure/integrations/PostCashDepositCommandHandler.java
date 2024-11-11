package com.sample.deposit.depositinfrastructure.integrations;


import com.sample.deposit.depositapplication.cashDeposit.commands.CashDepositCommand;
import com.sample.deposit.depositapplication.cashDeposit.dtos.CashDepositResponseDto;
import com.sample.deposit.depositapplication.cashDeposit.interfaces.CashDepositCommandHandler;
import org.springframework.stereotype.Component;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Component
public class PostCashDepositCommandHandler implements CashDepositCommandHandler {
    private static final Logger log = LoggerFactory.getLogger(PostCashDepositCommandHandler.class);

    @Override
    public Optional<CashDepositResponseDto> handle(CashDepositCommand command) {
        log.info("😬😬😬Handling deposit command");

        return Optional.of(new CashDepositResponseDto());
    }
}
