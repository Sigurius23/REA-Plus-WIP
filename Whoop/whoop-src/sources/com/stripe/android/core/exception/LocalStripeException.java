package com.stripe.android.core.exception;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/core/exception/LocalStripeException;", "Lcom/stripe/android/core/exception/StripeException;", "stripe-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class LocalStripeException extends StripeException {

    /* JADX INFO: renamed from: F */
    public final String f22152F;

    /* JADX INFO: renamed from: G */
    public final String f22153G;

    public LocalStripeException(String str, String str2) {
        super(0, 15, null, str, null, null);
        this.f22152F = str;
        this.f22153G = str2;
    }

    @Override // com.stripe.android.core.exception.StripeException
    /* JADX INFO: renamed from: a */
    public final String mo16832a() {
        String str = this.f22153G;
        return str == null ? "unknown" : str;
    }
}
