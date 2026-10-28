package h00;

import p715kotlin.jvm.internal.AbstractC22676k;
import q00.C29731o;
import se.AbstractC32417h;

/* JADX INFO: renamed from: h00.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C16522q extends AbstractC32417h {

    /* JADX INFO: renamed from: a */
    public final C29731o f63520a;

    public C16522q(C29731o c29731o) {
        this.f63520a = c29731o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16522q) && AbstractC22676k.m65745e(this.f63520a, ((C16522q) obj).f63520a);
    }

    public final int hashCode() {
        return this.f63520a.hashCode();
    }

    public final String toString() {
        return "DefaultPayment(paymentUI=" + this.f63520a + ")";
    }
}
