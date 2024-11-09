package com.sample.shared.interfaces;

public interface RequestHandler<TRequest, TResponse> {
    public TResponse handle(TRequest request);
}
