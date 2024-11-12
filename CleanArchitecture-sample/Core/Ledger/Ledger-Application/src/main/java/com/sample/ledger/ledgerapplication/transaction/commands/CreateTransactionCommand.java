package com.sample.ledger.ledgerapplication.transaction.commands;

import com.sample.shared.sharedcontract.interfaces.RequestStream;

import java.util.UUID;

public record CreateTransactionCommand(
        UUID transactionId
) implements RequestStream {
}
