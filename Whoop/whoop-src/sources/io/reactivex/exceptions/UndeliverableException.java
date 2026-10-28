package io.reactivex.exceptions;

import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes3.dex */
public final class UndeliverableException extends IllegalStateException {
    public UndeliverableException(Throwable th3) {
        super(AbstractC2875y.m8301n("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ", th3), th3);
    }
}
