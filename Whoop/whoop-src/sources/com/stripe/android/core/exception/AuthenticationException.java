package com.stripe.android.core.exception;

import p442qy.C30767f;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/core/exception/AuthenticationException;", "Lcom/stripe/android/core/exception/StripeException;", "stripe-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class AuthenticationException extends StripeException {
    public AuthenticationException(C30767f c30767f, String str) {
        super(401, 24, str, null, null, c30767f);
    }

    @Override // com.stripe.android.core.exception.StripeException
    /* JADX INFO: renamed from: a */
    public final String mo16832a() {
        return "authError";
    }
}
