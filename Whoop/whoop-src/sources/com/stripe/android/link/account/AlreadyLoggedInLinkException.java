package com.stripe.android.link.account;

import com.stripe.android.core.exception.StripeException;
import d00.InterfaceC11427f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/link/account/AlreadyLoggedInLinkException;", "Lcom/stripe/android/core/exception/StripeException;", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final /* data */ class AlreadyLoggedInLinkException extends StripeException {

    /* JADX INFO: renamed from: F */
    public final String f22208F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC11427f f22209G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlreadyLoggedInLinkException(String str, InterfaceC11427f accountStatus) {
        super(0, 31, null, null, null, null);
        AbstractC22676k.m65750j(accountStatus, "accountStatus");
        this.f22208F = str;
        this.f22209G = accountStatus;
    }

    @Override // com.stripe.android.core.exception.StripeException
    /* JADX INFO: renamed from: a */
    public final String mo16832a() {
        return "alreadyLoggedIntoLinkError";
    }

    @Override // com.stripe.android.core.exception.StripeException
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlreadyLoggedInLinkException)) {
            return false;
        }
        AlreadyLoggedInLinkException alreadyLoggedInLinkException = (AlreadyLoggedInLinkException) obj;
        return AbstractC22676k.m65745e(this.f22208F, alreadyLoggedInLinkException.f22208F) && AbstractC22676k.m65745e(this.f22209G, alreadyLoggedInLinkException.f22209G);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public final int hashCode() {
        String str = this.f22208F;
        return this.f22209G.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // com.stripe.android.core.exception.StripeException, java.lang.Throwable
    public final String toString() {
        return "AlreadyLoggedInLinkException(email=" + this.f22208F + ", accountStatus=" + this.f22209G + ")";
    }
}
