package a30;

import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38837g3;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: a30.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0336y0 extends AbstractC0287e1 {

    /* JADX INFO: renamed from: w */
    public final EnumC38837g3 f1183w;

    /* JADX INFO: renamed from: x */
    public final String f1184x;

    /* JADX INFO: renamed from: y */
    public final String f1185y;

    public C0336y0(EnumC38837g3 confirmationMethod) {
        AbstractC22676k.m65750j(confirmationMethod, "confirmationMethod");
        this.f1183w = confirmationMethod;
        this.f1184x = "invalidConfirmationMethod";
        this.f1185y = AbstractC39415s.m125909s("\n            PaymentIntent with confirmation_method='automatic' is required.\n            The current PaymentIntent has confirmation_method '" + confirmationMethod + "'.\n            See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-confirmation_method.\n        ");
    }

    @Override // a30.AbstractC0287e1
    /* JADX INFO: renamed from: a */
    public final String mo816a() {
        return this.f1184x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0336y0) && this.f1183w == ((C0336y0) obj).f1183w;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f1185y;
    }

    public final int hashCode() {
        return this.f1183w.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "InvalidConfirmationMethod(confirmationMethod=" + this.f1183w + ")";
    }
}
