package com.stripe.android.core.exception;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Lcom/stripe/android/core/exception/APIConnectionException;", "Lcom/stripe/android/core/exception/StripeException;", "s4/a", "stripe-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class APIConnectionException extends StripeException {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ int f22150F = 0;

    public APIConnectionException() {
        this(null, null);
    }

    @Override // com.stripe.android.core.exception.StripeException
    /* JADX INFO: renamed from: a */
    public final String mo16832a() {
        return "connectionError";
    }

    public APIConnectionException(String str, Throwable th3) {
        super(0, 7, null, str, th3, null);
    }
}
