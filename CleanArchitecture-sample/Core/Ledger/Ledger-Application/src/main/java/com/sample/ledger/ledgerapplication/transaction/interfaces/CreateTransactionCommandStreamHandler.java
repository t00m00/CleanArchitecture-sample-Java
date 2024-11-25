package com.sample.ledger.ledgerapplication.transaction.interfaces;

import com.sample.ledger.ledgerapplication.transaction.commands.CreateTransactionCommand;
import com.sample.ledger.ledgerapplication.transaction.dtos.CreateTransactionResponseDto;
import com.sample.shared.sharedcontract.interfaces.RequestStreamHandler;
import com.sample.shared.sharedcontract.interfaces.ResponseObserver;

/**
 * gRPC の場合のサンプル
 */
public interface CreateTransactionCommandStreamHandler extends RequestStreamHandler<CreateTransactionCommand, CreateTransactionResponseDto> {
    public void handle(CreateTransactionCommand request, ResponseObserver<CreateTransactionResponseDto> responseObserver);
}