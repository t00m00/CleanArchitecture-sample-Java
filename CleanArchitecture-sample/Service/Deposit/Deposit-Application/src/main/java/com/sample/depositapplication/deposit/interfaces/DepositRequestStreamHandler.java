package com.sample.depositapplication.deposit.interfaces;

import com.sample.depositapplication.deposit.commands.DepositCommand;
import com.sample.depositapplication.deposit.dtos.DepositResponseDto;
import com.sample.shared.interfaces.RequestStreamHandler;
import com.sample.shared.interfaces.ResponseObserver;

/**
 * gRPC の場合のサンプル
 */
public interface DepositRequestStreamHandler extends RequestStreamHandler<DepositCommand, DepositResponseDto> {
    public void handle(DepositCommand request, ResponseObserver<DepositResponseDto> responseObserver);
}