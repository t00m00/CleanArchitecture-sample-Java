package com.sample.ledger.ledgerendpoints.transaction.dtos;

import java.util.UUID;

public record PostTransactionRequestDto(
        UUID transactionId
) {
}
