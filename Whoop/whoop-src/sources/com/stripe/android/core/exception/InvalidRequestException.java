package com.stripe.android.core.exception;

import p442qy.C30767f;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/core/exception/InvalidRequestException;", "Lcom/stripe/android/core/exception/StripeException;", "stripe-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class InvalidRequestException extends StripeException {
    public InvalidRequestException() {
        this(0, 31, null, null, null, null);
    }

    @Override // com.stripe.android.core.exception.StripeException
    /* JADX INFO: renamed from: a */
    public final String mo16832a() {
        return "invalidRequestError";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InvalidRequestException(int i13, int i14, String str, String str2, Throwable th3, C30767f c30767f) {
        c30767f = (i14 & 1) != 0 ? null : c30767f;
        str = (i14 & 2) != 0 ? null : str;
        i13 = (i14 & 4) != 0 ? 0 : i13;
        if ((i14 & 8) != 0) {
            str2 = c30767f != null ? c30767f.f126703x : null;
        }
        super(c30767f, str, i13, (i14 & 16) != 0 ? null : th3, str2);
    }
}
