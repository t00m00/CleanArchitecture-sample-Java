package com.sample.shared.sharedcontract.interfaces;

public interface RequestStreamHandler<TRequest, TResponse> {
    public void handle(TRequest request, ResponseObserver<TResponse> responseObserver);
}
