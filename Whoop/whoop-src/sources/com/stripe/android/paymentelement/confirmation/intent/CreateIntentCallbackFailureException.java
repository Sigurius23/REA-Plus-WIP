package com.stripe.android.paymentelement.confirmation.intent;

import com.stripe.android.core.exception.StripeException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/CreateIntentCallbackFailureException;", "Lcom/stripe/android/core/exception/StripeException;", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CreateIntentCallbackFailureException extends StripeException {

    /* JADX INFO: renamed from: F */
    public final Throwable f22332F;

    public CreateIntentCallbackFailureException(Exception exc) {
        super(0, 31, null, null, null, null);
        this.f22332F = exc;
    }

    @Override // com.stripe.android.core.exception.StripeException
    /* JADX INFO: renamed from: a */
    public final String mo16832a() {
        return "merchantReturnedCreateIntentCallbackFailure";
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f22332F;
    }
}
