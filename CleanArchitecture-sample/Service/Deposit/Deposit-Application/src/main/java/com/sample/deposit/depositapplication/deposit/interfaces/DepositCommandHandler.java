package com.sample.deposit.depositapplication.deposit.interfaces;

import com.sample.deposit.depositapplication.deposit.commands.DepositCommand;
import com.sample.deposit.depositapplication.deposit.dtos.DepositResponseDto;
import com.sample.shared.sharedcontract.interfaces.RequestHandler;

import java.util.Optional;

/**
 * REST API の場合のサンプル
 */
public interface DepositCommandHandler extends RequestHandler<DepositCommand, Optional<DepositResponseDto>> {
    public Optional<DepositResponseDto> handle(DepositCommand command);
}

