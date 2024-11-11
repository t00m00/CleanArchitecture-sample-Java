package com.sample.deposit.depositendpoints.deposit;

import com.sample.deposit.depositapplication.cashdeposit.commands.CashDepositCommand;
import com.sample.deposit.depositapplication.cashdeposit.interfaces.CashDepositCommandHandler;
import com.sample.deposit.depositendpoints.deposit.dtos.PostCashDepositResponseDto;
import com.sample.deposit.depositendpoints.deposit.dtos.PostCashDepositRequestDto;
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
@RequestMapping("/v1/deposit")
public class PostCashDepositController {
    private static final Logger log = LoggerFactory.getLogger(PostCashDepositController.class);
    private final CashDepositCommandHandler cashDepositCommandHandler;

    @PostMapping
    public PostCashDepositResponseDto deposit(@RequestBody PostCashDepositRequestDto request) {
        log.info("✅✅✅Deposit successful. {}", request);

        var result = cashDepositCommandHandler.handle(new CashDepositCommand());

        return new PostCashDepositResponseDto(new BigDecimal(1_000_000));
    }
}
