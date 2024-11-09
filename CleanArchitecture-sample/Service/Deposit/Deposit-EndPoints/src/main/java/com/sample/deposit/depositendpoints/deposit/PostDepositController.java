package com.sample.deposit.depositendpoints.deposit;

import com.sample.deposit.depositendpoints.deposit.dtos.PostDepositResponseDto;
import com.sample.deposit.depositendpoints.deposit.dtos.PostDepositRequestDto;
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
public class PostDepositController {
    private static final Logger log = LoggerFactory.getLogger(PostDepositController.class);
//    private final DepositCommandHandler depositCommandHandler;

    @PostMapping
    public PostDepositResponseDto deposit(@RequestBody PostDepositRequestDto request) {
        log.info("✅✅✅Deposit successful. {}", request);

//        var result = depositCommandHandler.handle(new DepositCommand());

        return new PostDepositResponseDto(new BigDecimal(1_000_000));
    }
}
