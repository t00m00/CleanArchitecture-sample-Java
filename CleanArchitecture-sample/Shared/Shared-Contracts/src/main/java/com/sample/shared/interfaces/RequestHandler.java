package com.sample.shared.interfaces;

public interface RequestHandler<TRequest extends Request, TResponse> {
    public TResponse handle(TRequest request);
}
