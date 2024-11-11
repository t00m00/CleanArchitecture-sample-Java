package com.sample.deposit.depositapplication.cashdeposit.interfaces;

import com.sample.deposit.depositapplication.cashdeposit.commands.CashDepositCommand;
import com.sample.deposit.depositapplication.cashdeposit.dtos.CashDepositResponseDto;
import com.sample.shared.sharedcontract.interfaces.RequestHandler;
import jakarta.validation.Valid;

import java.util.Optional;

/**
 * REST API の場合のサンプル
 */
public interface CashDepositCommandHandler extends RequestHandler<CashDepositCommand, Optional<CashDepositResponseDto>> {
    public Optional<CashDepositResponseDto> handle(@Valid CashDepositCommand command);
}
