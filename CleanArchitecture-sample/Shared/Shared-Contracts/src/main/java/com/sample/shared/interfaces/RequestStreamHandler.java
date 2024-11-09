package com.sample.shared.interfaces;

public interface RequestStreamHandler<TRequest, TResponse> {
    public void handle(TRequest request, ResponseObserver<TResponse> responseObserver);
}
