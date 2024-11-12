package com.sample.ledger.ledgerapplication.transaction.dtos;

import java.util.UUID;

public record CreateTransactionResponseDto(
        UUID resultTransactionId
) {
}
