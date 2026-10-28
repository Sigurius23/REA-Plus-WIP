package com.stripe.android.core.exception;

import java.util.Objects;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p442qy.C30767f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/core/exception/StripeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "s4/d", "stripe-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public abstract class StripeException extends Exception {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ int f22154E = 0;

    /* JADX INFO: renamed from: w */
    public final C30767f f22155w;

    /* JADX INFO: renamed from: x */
    public final String f22156x;

    /* JADX INFO: renamed from: y */
    public final int f22157y;

    /* JADX INFO: renamed from: z */
    public final boolean f22158z;

    /* JADX WARN: Illegal instructions before constructor call */
    public StripeException() {
        int i13 = 0;
        this(i13, 31, null, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public String mo16832a() {
        return "stripeException";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeException) {
            StripeException stripeException = (StripeException) obj;
            if (AbstractC22676k.m65745e(this.f22155w, stripeException.f22155w) && AbstractC22676k.m65745e(this.f22156x, stripeException.f22156x) && this.f22157y == stripeException.f22157y && AbstractC22676k.m65745e(getMessage(), stripeException.getMessage())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f22155w, this.f22156x, Integer.valueOf(this.f22157y), getMessage());
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str = this.f22156x;
        return AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{str != null ? "Request-id: ".concat(str) : null, super.toString()}), "\n", null, null, null, 62);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StripeException(int i13, int i14, String str, String str2, Throwable th3, C30767f c30767f) {
        c30767f = (i14 & 1) != 0 ? null : c30767f;
        this(c30767f, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? null : th3, (i14 & 16) != 0 ? c30767f != null ? c30767f.m94515b() : null : str2);
    }

    public StripeException(C30767f c30767f, String str, int i13, Throwable th3, String str2) {
        super(str2, th3);
        this.f22155w = c30767f;
        this.f22156x = str;
        this.f22157y = i13;
        boolean z4 = false;
        if (400 <= i13 && i13 < 500) {
            z4 = true;
        }
        this.f22158z = z4;
    }
}
