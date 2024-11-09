package com.sample.depositendpoints.deposit.dtos;

import java.math.BigDecimal;

public record PostDepositResponseDto(
        BigDecimal balance
) {
}
