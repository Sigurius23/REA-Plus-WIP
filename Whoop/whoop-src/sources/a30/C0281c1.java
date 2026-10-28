package a30;

import com.stripe.android.model.StripeIntent$Status;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: a30.c1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0281c1 extends AbstractC0287e1 {

    /* JADX INFO: renamed from: w */
    public final StripeIntent$Status f987w;

    /* JADX INFO: renamed from: x */
    public final String f988x = "setupIntentInTerminalState";

    public C0281c1(StripeIntent$Status stripeIntent$Status) {
        this.f987w = stripeIntent$Status;
    }

    @Override // a30.AbstractC0287e1
    /* JADX INFO: renamed from: a */
    public final String mo816a() {
        return this.f988x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0281c1) && this.f987w == ((C0281c1) obj).f987w;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return AbstractC39415s.m125909s("\n                PaymentSheet cannot set up a SetupIntent in status '" + this.f987w + "'.\n                See https://stripe.com/docs/api/setup_intents/object#setup_intent_object-status.\n            ");
    }

    public final int hashCode() {
        StripeIntent$Status stripeIntent$Status = this.f987w;
        if (stripeIntent$Status == null) {
            return 0;
        }
        return stripeIntent$Status.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "SetupIntentInTerminalState(status=" + this.f987w + ")";
    }
}
