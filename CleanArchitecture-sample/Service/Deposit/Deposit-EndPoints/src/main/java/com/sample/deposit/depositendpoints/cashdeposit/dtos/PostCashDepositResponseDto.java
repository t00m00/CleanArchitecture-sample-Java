package com.sample.deposit.depositendpoints.cashdeposit.dtos;

import java.math.BigDecimal;

public record PostCashDepositResponseDto(
        BigDecimal balance
) {
}
