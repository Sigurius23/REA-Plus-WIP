package io.reactivex.exceptions;

import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes3.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    public OnErrorNotImplementedException(Throwable th3) {
        super(AbstractC2875y.m8301n("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ", th3), th3 == null ? new NullPointerException() : th3);
    }
}
