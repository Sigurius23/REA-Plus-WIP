package com.stripe.android.paymentelement.confirmation.intent;

import com.stripe.android.core.exception.StripeException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38840g6;
import y00.C38887l3;
import y00.InterfaceC38802c8;
import yb3.AbstractC39415s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/InvalidClientSecretException;", "Lcom/stripe/android/core/exception/StripeException;", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class InvalidClientSecretException extends StripeException {

    /* JADX INFO: renamed from: F */
    public final String f22334F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidClientSecretException(String clientSecret, InterfaceC38802c8 intent) {
        String str;
        super(0, 31, null, null, null, null);
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(intent, "intent");
        if (intent instanceof C38887l3) {
            str = "PaymentIntent";
        } else {
            if (!(intent instanceof C38840g6)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "SetupIntent";
        }
        this.f22334F = AbstractC39415s.m125909s("\n        Encountered an invalid client secret \"" + clientSecret + "\" for intent type \"" + str + "\"\n    ");
    }

    @Override // com.stripe.android.core.exception.StripeException
    /* JADX INFO: renamed from: a */
    public final String getF22331G() {
        return "invalidClientSecretProvided";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f22334F;
    }
}
