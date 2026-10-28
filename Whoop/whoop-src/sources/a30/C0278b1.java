package a30;

import com.stripe.android.model.StripeIntent$Status;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: a30.b1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0278b1 extends AbstractC0287e1 {

    /* JADX INFO: renamed from: w */
    public final StripeIntent$Status f977w;

    /* JADX INFO: renamed from: x */
    public final String f978x = "paymentIntentInTerminalState";

    public C0278b1(StripeIntent$Status stripeIntent$Status) {
        this.f977w = stripeIntent$Status;
    }

    @Override // a30.AbstractC0287e1
    /* JADX INFO: renamed from: a */
    public final String mo816a() {
        return this.f978x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0278b1) && this.f977w == ((C0278b1) obj).f977w;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return AbstractC39415s.m125909s("\n                PaymentSheet cannot set up a PaymentIntent in status '" + this.f977w + "'.\n                See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status.\n            ");
    }

    public final int hashCode() {
        StripeIntent$Status stripeIntent$Status = this.f977w;
        if (stripeIntent$Status == null) {
            return 0;
        }
        return stripeIntent$Status.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "PaymentIntentInTerminalState(status=" + this.f977w + ")";
    }
}
