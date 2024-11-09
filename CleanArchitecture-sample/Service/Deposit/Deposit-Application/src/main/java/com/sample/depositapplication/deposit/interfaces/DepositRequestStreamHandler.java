package com.sample.depositapplication.deposit.interfaces;

import com.sample.depositapplication.deposit.commands.DepositCommand;
import com.sample.depositapplication.deposit.dtos.DepositResponseDto;

public interface ResponseObserver<T> {
    void onNext(T value);
    void onError(Throwable t);
    void onCompleted();
}

public interface RequestStreamHandler<TRequest, TResponse> {
    public void handle(TRequest request, ResponseObserver<TResponse> responseObserver);
}


/**
 * gRPC の場合のサンプル
 */
public interface DepositRequestStreamHandler extends RequestStreamHandler<DepositCommand, DepositResponseDto> {
    public void handle(DepositCommand request, ResponseObserver<DepositResponseDto> responseObserver);
}