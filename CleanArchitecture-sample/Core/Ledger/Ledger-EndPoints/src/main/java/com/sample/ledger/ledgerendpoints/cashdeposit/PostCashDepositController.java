package com.sample.ledger.ledgerendpoints.cashdeposit;

import com.sample.ledger.ledgerapplication.cashdeposit.commands.CashDepositCommand;
import com.sample.ledger.ledgerapplication.cashdeposit.interfaces.CashDepositCommandHandler;
import com.sample.ledger.ledgerendpoints.cashdeposit.dtos.PostCashDepositRequestDto;
import com.sample.ledger.ledgerendpoints.cashdeposit.dtos.PostCashDepositResponseDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@RequestMapping("/v1/ledger-deposit")
public class PostCashDepositController {
    private static final Logger log = LoggerFactory.getLogger(PostCashDepositController.class);
    // TODO: T.B.D
    // private final CashDepositCommandHandler cashDepositCommandHandler;

    @PostMapping
    public PostCashDepositResponseDto deposit(@RequestBody PostCashDepositRequestDto request) {
        log.info("🐧Successful. Ledger cash deposit. {}", request);

//        var result = cashDepositCommandHandler.handle(new CashDepositCommand());

        return new PostCashDepositResponseDto(new BigDecimal(2_000_000));
    }
}
