package com.sample.deposit.depositendpoints.deposit.dtos;

import java.math.BigDecimal;

public record PostDepositResponseDto(
        BigDecimal balance
) {
}
