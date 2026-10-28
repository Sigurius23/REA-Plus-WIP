package i10;

import h20.C16767y1;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38977v3;

/* JADX INFO: renamed from: i10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C17853c {

    /* JADX INFO: renamed from: a */
    public final String f69473a;

    /* JADX INFO: renamed from: b */
    public final C16767y1 f69474b;

    /* JADX INFO: renamed from: c */
    public final C38977v3 f69475c;

    public C17853c(String paymentElementCallbackIdentifier, C16767y1 type, C38977v3 c38977v3) {
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        AbstractC22676k.m65750j(type, "type");
        this.f69473a = paymentElementCallbackIdentifier;
        this.f69474b = type;
        this.f69475c = c38977v3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17853c)) {
            return false;
        }
        C17853c c17853c = (C17853c) obj;
        return AbstractC22676k.m65745e(this.f69473a, c17853c.f69473a) && AbstractC22676k.m65745e(this.f69474b, c17853c.f69474b) && AbstractC22676k.m65745e(this.f69475c, c17853c.f69475c);
    }

    public final int hashCode() {
        int iHashCode = (this.f69474b.hashCode() + (this.f69473a.hashCode() * 31)) * 31;
        C38977v3 c38977v3 = this.f69475c;
        return iHashCode + (c38977v3 == null ? 0 : c38977v3.hashCode());
    }

    public final String toString() {
        return "CustomPaymentMethodInput(paymentElementCallbackIdentifier=" + this.f69473a + ", type=" + this.f69474b + ", billingDetails=" + this.f69475c + ")";
    }
}
