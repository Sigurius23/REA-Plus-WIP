package com.stripe.android.link;

import com.stripe.android.core.exception.StripeException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/link/LinkEventException;", "Lcom/stripe/android/core/exception/StripeException;", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class LinkEventException extends StripeException {

    /* JADX INFO: renamed from: F */
    public final Throwable f22200F;

    public LinkEventException(Throwable th3) {
        super(0, 23, null, null, th3, null);
        this.f22200F = th3;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f22200F;
    }
}
