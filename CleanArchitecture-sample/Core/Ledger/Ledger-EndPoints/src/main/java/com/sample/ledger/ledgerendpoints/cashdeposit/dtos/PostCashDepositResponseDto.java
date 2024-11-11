package com.sample.ledger.ledgerendpoints.cashdeposit.dtos;

import java.math.BigDecimal;

public record PostCashDepositResponseDto(
        BigDecimal balance
) {
}
