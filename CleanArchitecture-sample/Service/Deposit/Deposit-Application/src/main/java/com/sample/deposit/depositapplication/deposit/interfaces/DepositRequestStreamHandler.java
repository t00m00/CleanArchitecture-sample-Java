package com.sample.deposit.depositapplication.deposit.interfaces;

import com.sample.deposit.depositapplication.deposit.commands.DepositCommand;
import com.sample.deposit.depositapplication.deposit.dtos.DepositResponseDto;
import com.sample.shared.sharedcontract.interfaces.RequestStreamHandler;
import com.sample.shared.sharedcontract.interfaces.ResponseObserver;

/**
 * gRPC の場合のサンプル
 */
public interface DepositRequestStreamHandler extends RequestStreamHandler<DepositCommand, DepositResponseDto> {
    public void handle(DepositCommand request, ResponseObserver<DepositResponseDto> responseObserver);
}