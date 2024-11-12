package com.sample.ledger.ledgerendpoints.transaction;

import com.sample.ledger.ledgerapplication.transaction.commands.CreateTransactionCommand;
import com.sample.ledger.ledgerapplication.transaction.interfaces.CreateTransactionCommandStreamHandler;
import com.sample.ledger.ledgerendpoints.observers.LogResponseObserver;
import com.sample.ledger.ledgerendpoints.transaction.dtos.PostTransactionRequestDto;
import com.sample.ledger.ledgerendpoints.transaction.dtos.PostTransactionResponseDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicReference;


/*
 * FIXME: 本来は gRPC の EndPoints を作成する必要があるが、まだ gRPC を理解していないため REST で仮として作成している
 */
@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@RequestMapping("/v1/ledger-transaction")
public class PostTransactionController {
    private static final Logger log = LoggerFactory.getLogger(PostTransactionController.class);
    // TODO: T.B.D
    private final CreateTransactionCommandStreamHandler createTransactionCommandStreamHandler;

    @PostMapping
    public PostTransactionResponseDto create(@RequestBody PostTransactionRequestDto request) {
        log.info("🚅Successful. Ledger transaction. {}", request);

        AtomicReference<String> response = new AtomicReference<>("");
        createTransactionCommandStreamHandler.handle(
            new CreateTransactionCommand(request.transactionId()),
            new LogResponseObserver<>(log, s -> response.set(String.valueOf(s))));

        return new PostTransactionResponseDto(response.get());
    }
}
