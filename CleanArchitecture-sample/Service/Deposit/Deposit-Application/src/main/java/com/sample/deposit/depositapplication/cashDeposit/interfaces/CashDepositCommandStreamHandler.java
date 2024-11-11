package com.sample.deposit.depositapplication.cashDeposit.interfaces;

import com.sample.deposit.depositapplication.cashDeposit.commands.CashDepositCommand;
import com.sample.deposit.depositapplication.cashDeposit.dtos.CashDepositResponseDto;
import com.sample.shared.sharedcontract.interfaces.RequestStreamHandler;
import com.sample.shared.sharedcontract.interfaces.ResponseObserver;

/**
 * gRPC の場合のサンプル
 */
public interface CashDepositCommandStreamHandler extends RequestStreamHandler<CashDepositCommand, CashDepositResponseDto> {
    public void handle(CashDepositCommand request, ResponseObserver<CashDepositResponseDto> responseObserver);
}