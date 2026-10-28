package com.stripe.android.core.exception;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/core/exception/GenericStripeException;", "Lcom/stripe/android/core/exception/StripeException;", "stripe-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class GenericStripeException extends StripeException {

    /* JADX INFO: renamed from: F */
    public final String f22151F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericStripeException(String str, Throwable cause) {
        super(0, 7, null, cause.getMessage(), cause, null);
        AbstractC22676k.m65750j(cause, "cause");
        this.f22151F = str;
    }

    @Override // com.stripe.android.core.exception.StripeException
    /* JADX INFO: renamed from: a */
    public final String mo16832a() {
        String str = this.f22151F;
        return str == null ? "unknown" : str;
    }
}
