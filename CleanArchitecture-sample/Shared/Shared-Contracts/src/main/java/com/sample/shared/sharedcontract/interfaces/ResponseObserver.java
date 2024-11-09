package com.sample.shared.sharedcontract.interfaces;

public interface ResponseObserver<T> {
    void onNext(T value);
    void onError(Throwable t);
    void onCompleted();
}