package com.sample.ledger.ledgerendpoints.observers;

import com.sample.shared.sharedcontract.interfaces.ResponseObserver;
import org.slf4j.Logger;

import java.util.function.Consumer;

public final class LogResponseObserver<TResponse> implements ResponseObserver<TResponse> {
    private final Logger log;
    private final Consumer<TResponse> responseConsumer;

    public LogResponseObserver(Logger logger, Consumer<TResponse> responseConsumer) {
        this.log = logger;
        this.responseConsumer = responseConsumer;
    }

    @Override
    public void onNext(TResponse value) {
        this.log.info("🗒️call onNext in {}. value: {}", LogResponseObserver.class, value);
        this.responseConsumer.accept(value);
    }

    @Override
    public void onError(Throwable t) {
        this.log.info("🗒️call onError in {}. t: {}", LogResponseObserver.class, t.getStackTrace());
    }

    @Override
    public void onCompleted() {
        this.log.info("🗒️call onCompleted in {}", LogResponseObserver.class);
    }
}
