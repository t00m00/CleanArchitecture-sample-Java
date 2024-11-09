package com.sample.shared.sharedcontract.interfaces;

public interface RequestHandler<TRequest extends Request, TResponse> {
    public TResponse handle(TRequest request);
}
