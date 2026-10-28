package a30;

import com.stripe.android.core.exception.StripeException;
import p479s4.AbstractC32123d;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a30.d1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0284d1 extends AbstractC0287e1 {

    /* JADX INFO: renamed from: w */
    public final Throwable f1003w;

    /* JADX INFO: renamed from: x */
    public final String f1004x;

    public C0284d1(Throwable cause) {
        AbstractC22676k.m65750j(cause, "cause");
        this.f1003w = cause;
        this.f1004x = cause.getMessage();
    }

    @Override // a30.AbstractC0287e1
    /* JADX INFO: renamed from: a */
    public final String mo816a() {
        int i13 = StripeException.f22154E;
        return AbstractC32123d.m100024d(this.f1003w).getF22331G();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0284d1) && AbstractC22676k.m65745e(this.f1003w, ((C0284d1) obj).f1003w);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f1003w;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f1004x;
    }

    public final int hashCode() {
        return this.f1003w.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC36095b.m114681i("Unknown(cause=", ")", this.f1003w);
    }
}
