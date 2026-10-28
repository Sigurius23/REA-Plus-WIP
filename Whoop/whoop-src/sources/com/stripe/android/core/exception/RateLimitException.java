package com.stripe.android.core.exception;

import p442qy.C30767f;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/core/exception/RateLimitException;", "Lcom/stripe/android/core/exception/StripeException;", "stripe-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class RateLimitException extends StripeException {
    public RateLimitException() {
        this(null, null, 15);
    }

    @Override // com.stripe.android.core.exception.StripeException
    /* JADX INFO: renamed from: a */
    public final String mo16832a() {
        return "rateLimitError";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RateLimitException(C30767f c30767f, String str, int i13) {
        C30767f c30767f2 = (i13 & 1) != 0 ? null : c30767f;
        super(c30767f2, (i13 & 2) != 0 ? null : str, 429, null, c30767f2 != null ? c30767f2.f126703x : null);
    }
}
