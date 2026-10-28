package k20;

import com.stripe.android.core.exception.StripeException;
import p442qy.C30767f;
import p479s4.AbstractC32123d;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k20.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C22142g extends AbstractC22143h {

    /* JADX INFO: renamed from: w */
    public final Throwable f85890w;

    /* JADX INFO: renamed from: x */
    public final StripeException f85891x;

    /* JADX INFO: renamed from: y */
    public final String f85892y;

    public C22142g(Throwable cause) {
        AbstractC22676k.m65750j(cause, "cause");
        this.f85890w = cause;
        int i13 = StripeException.f22154E;
        StripeException stripeExceptionM100024d = AbstractC32123d.m100024d(cause);
        this.f85891x = stripeExceptionM100024d;
        C30767f c30767f = stripeExceptionM100024d.f22155w;
        this.f85892y = c30767f != null ? c30767f.f126704y : null;
    }

    @Override // k20.AbstractC22143h
    /* JADX INFO: renamed from: a */
    public final String mo63404a() {
        return this.f85891x.getF22331G();
    }

    @Override // k20.AbstractC22143h
    /* JADX INFO: renamed from: b */
    public final String mo63405b() {
        return this.f85892y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22142g) && AbstractC22676k.m65745e(this.f85890w, ((C22142g) obj).f85890w);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f85890w;
    }

    public final int hashCode() {
        return this.f85890w.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC36095b.m114681i("Stripe(cause=", ")", this.f85890w);
    }
}
