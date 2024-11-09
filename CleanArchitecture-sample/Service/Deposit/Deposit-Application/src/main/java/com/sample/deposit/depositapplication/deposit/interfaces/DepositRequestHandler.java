package com.sample.deposit.depositapplication.deposit.interfaces;

import com.sample.deposit.depositapplication.deposit.commands.DepositCommand;
import com.sample.deposit.depositapplication.deposit.dtos.DepositResponseDto;
import com.sample.shared.sharedcontract.interfaces.RequestHandler;

/**
 * REST API の場合のサンプル
 */
public interface DepositRequestHandler extends RequestHandler<DepositCommand, DepositResponseDto> {
    public DepositResponseDto handle(DepositCommand command);
}

