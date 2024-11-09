package com.sample.depositapplication.deposit.interfaces;

import com.sample.depositapplication.deposit.commands.DepositCommand;
import com.sample.depositapplication.deposit.dtos.DepositResponseDto;

public interface RequestHandler<TRequest, TResponse> {
    public TResponse handle(TRequest request);
}

/**
 * RESTful API の場合のサンプル
 */
public interface DepositRequestHandler extends RequestHandler<DepositCommand, DepositResponseDto> {
    public DepositResponseDto handle(DepositCommand command);
}

