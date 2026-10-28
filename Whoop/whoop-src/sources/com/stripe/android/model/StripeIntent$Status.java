package com.stripe.android.model;

import androidx.annotation.Keep;
import ge3.AbstractC15751g;
import p499t9.C33647p;
import p715kotlin.Metadata;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.stripe.android.model.StripeIntent$Status[], still in use, count: 1, list:
  (r0v1 com.stripe.android.model.StripeIntent$Status[]) from 0x0058: INVOKE (r0v1 com.stripe.android.model.StripeIntent$Status[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"com/stripe/android/model/StripeIntent$Status", "", "Lcom/stripe/android/model/StripeIntent$Status;", "", "toString", "()Ljava/lang/String;", "t9/p", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class StripeIntent$Status {
    Canceled("canceled"),
    Processing("processing"),
    RequiresAction("requires_action"),
    /* JADX INFO: Fake field, exist only in values array */
    RequiresConfirmation("requires_confirmation"),
    RequiresPaymentMethod("requires_payment_method"),
    Succeeded("succeeded"),
    RequiresCapture("requires_capture");


    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ C33617b f22248J;

    /* JADX INFO: renamed from: x */
    public static final C33647p f22249x = new C33647p(26);

    /* JADX INFO: renamed from: w */
    public final String f22252w;

    static {
        f22248J = AbstractC15751g.m44468u(new StripeIntent$Status[]{r0, r1, r2, r3, r4, r5, r6});
    }

    public StripeIntent$Status(String str) {
        super(str, i);
        this.f22252w = str;
    }

    public static StripeIntent$Status valueOf(String str) {
        return (StripeIntent$Status) Enum.valueOf(StripeIntent$Status.class, str);
    }

    public static StripeIntent$Status[] values() {
        return (StripeIntent$Status[]) f22247I.clone();
    }

    @Override // java.lang.Enum
    @Keep
    public String toString() {
        return this.f22252w;
    }
}
