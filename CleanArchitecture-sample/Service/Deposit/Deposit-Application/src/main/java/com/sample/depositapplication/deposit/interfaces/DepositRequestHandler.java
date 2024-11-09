package com.sample.depositapplication.deposit.interfaces;

import com.sample.depositapplication.deposit.commands.DepositCommand;
import com.sample.depositapplication.deposit.dtos.DepositResponseDto;
import com.sample.shared.interfaces.RequestHandler;

/**
 * RESTful API の場合のサンプル
 */
public interface DepositRequestHandler extends RequestHandler<DepositCommand, DepositResponseDto> {
    public DepositResponseDto handle(DepositCommand command);
}

