package com.sample.deposit.depositinfrastructure.integrations;


import com.sample.deposit.depositapplication.deposit.commands.DepositCommand;
import com.sample.deposit.depositapplication.deposit.dtos.DepositResponseDto;
import com.sample.deposit.depositapplication.deposit.interfaces.DepositCommandHandler;
import org.springframework.stereotype.Component;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Component
public class PostDepositCommandHandler implements DepositCommandHandler {
    private static final Logger log = LoggerFactory.getLogger(PostDepositCommandHandler.class);

    @Override
    public Optional<DepositResponseDto> handle(DepositCommand command) {
        log.info("😬😬😬Handling deposit command");

        return Optional.of(new DepositResponseDto());
    }
}
