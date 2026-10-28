package com.stripe.android.paymentelement.confirmation.intent;

import com.stripe.android.core.exception.StripeException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;", "Lcom/stripe/android/core/exception/StripeException;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class InvalidDeferredIntentUsageException extends StripeException {

    /* JADX INFO: renamed from: F */
    public final String f22335F;

    public InvalidDeferredIntentUsageException() {
        super(0, 31, null, null, null, null);
        this.f22335F = "The payment method on the intent doesn't match the one provided in the createIntentCallback. When using deferred\nintent creation, ensure you're either creating a new intent with the correct payment method or updating an\nexisting intent with the new payment method ID.";
    }

    @Override // com.stripe.android.core.exception.StripeException
    /* JADX INFO: renamed from: a */
    public final String mo16832a() {
        return "invalidDeferredIntentUsage";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f22335F;
    }
}
