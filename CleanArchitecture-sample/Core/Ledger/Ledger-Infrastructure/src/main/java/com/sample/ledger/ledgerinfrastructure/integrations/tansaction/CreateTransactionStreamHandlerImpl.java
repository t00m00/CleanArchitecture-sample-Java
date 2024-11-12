package com.sample.ledger.ledgerinfrastructure.integrations.tansaction;

import com.sample.ledger.ledgerapplication.transaction.commands.CreateTransactionCommand;
import com.sample.ledger.ledgerapplication.transaction.dtos.CreateTransactionResponseDto;
import com.sample.ledger.ledgerapplication.transaction.interfaces.CreateTransactionCommandStreamHandler;
import com.sample.shared.sharedcontract.interfaces.ResponseObserver;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Component
public class CreateTransactionStreamHandlerImpl implements CreateTransactionCommandStreamHandler {
    private static final Logger log = LoggerFactory.getLogger(CreateTransactionStreamHandlerImpl.class);

    @Override
    public void handle(CreateTransactionCommand request, ResponseObserver<CreateTransactionResponseDto> responseObserver) {
        log.info("🚅🚅Handling Create Transaction Command");

        // Use Case
        // T.B.D

        responseObserver.onNext(new CreateTransactionResponseDto(request.transactionId()));
        responseObserver.onCompleted();
    }
}
