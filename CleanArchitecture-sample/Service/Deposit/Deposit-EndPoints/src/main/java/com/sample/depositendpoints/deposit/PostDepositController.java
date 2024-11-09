package com.sample.depositendpoints.deposit;

import com.sample.depositendpoints.deposit.dtos.PostDepositRequestDto;
import com.sample.depositendpoints.deposit.dtos.PostDepositResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/v1/deposit")
public class PostDepositController {
    private static final Logger log = LoggerFactory.getLogger(PostDepositController.class);

    @PostMapping
    public PostDepositResponseDto deposit(@RequestBody PostDepositRequestDto request) {
        log.info("✅✅✅Deposit successful. {}", request);
        return new PostDepositResponseDto(new BigDecimal(1_000_000));
    }
}
