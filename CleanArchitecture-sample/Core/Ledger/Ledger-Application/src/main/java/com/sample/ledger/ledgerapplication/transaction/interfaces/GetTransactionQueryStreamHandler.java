package com.sample.ledger.ledgerapplication.transaction.interfaces;

import com.sample.ledger.ledgerapplication.transaction.dtos.GetTransactionResponseDto;
import com.sample.ledger.ledgerapplication.transaction.queries.GetTransactionQuery;
import com.sample.shared.sharedcontract.interfaces.RequestStreamHandler;
import com.sample.shared.sharedcontract.interfaces.ResponseObserver;

/**
 * gRPC の場合のサンプル（仮）
 */
public interface GetTransactionQueryStreamHandler extends RequestStreamHandler<GetTransactionQuery, GetTransactionResponseDto> {
    public void handle(GetTransactionQuery request, ResponseObserver<GetTransactionResponseDto> responseObserver);
}