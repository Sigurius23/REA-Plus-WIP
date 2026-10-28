package com.stripe.android.paymentelement.confirmation.intent;

import com.stripe.android.core.exception.StripeException;
import p696zy.InterfaceC41211c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/CallbackNotFoundException;", "Lcom/stripe/android/core/exception/StripeException;", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CallbackNotFoundException extends StripeException {

    /* JADX INFO: renamed from: F */
    public final InterfaceC41211c f22330F;

    /* JADX INFO: renamed from: G */
    public final String f22331G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackNotFoundException(String message, InterfaceC41211c interfaceC41211c, String analyticsValue) {
        super(0, 15, null, message, null, null);
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(analyticsValue, "analyticsValue");
        this.f22330F = interfaceC41211c;
        this.f22331G = analyticsValue;
    }

    @Override // com.stripe.android.core.exception.StripeException
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF22331G() {
        return this.f22331G;
    }
}
