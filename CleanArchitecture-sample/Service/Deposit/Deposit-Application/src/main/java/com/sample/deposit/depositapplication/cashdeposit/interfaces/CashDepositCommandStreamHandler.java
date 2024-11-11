package com.sample.deposit.depositapplication.cashdeposit.interfaces;

import com.sample.deposit.depositapplication.cashdeposit.commands.CashDepositCommand;
import com.sample.deposit.depositapplication.cashdeposit.dtos.CashDepositResponseDto;
import com.sample.shared.sharedcontract.interfaces.RequestStreamHandler;
import com.sample.shared.sharedcontract.interfaces.ResponseObserver;

/**
 * gRPC の場合のサンプル
 */
public interface CashDepositCommandStreamHandler extends RequestStreamHandler<CashDepositCommand, CashDepositResponseDto> {
    public void handle(CashDepositCommand request, ResponseObserver<CashDepositResponseDto> responseObserver);
}