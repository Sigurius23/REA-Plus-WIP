package h20;

import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38977v3;
import y00.C39013z3;

/* JADX INFO: renamed from: h20.m4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16698m4 implements InterfaceC16728r4 {

    /* JADX INFO: renamed from: a */
    public final C39013z3 f64222a;

    /* JADX INFO: renamed from: b */
    public final C38977v3 f64223b;

    public C16698m4(C39013z3 card, C38977v3 c38977v3) {
        AbstractC22676k.m65750j(card, "card");
        this.f64222a = card;
        this.f64223b = c38977v3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16698m4)) {
            return false;
        }
        C16698m4 c16698m4 = (C16698m4) obj;
        return AbstractC22676k.m65745e(this.f64222a, c16698m4.f64222a) && AbstractC22676k.m65745e(this.f64223b, c16698m4.f64223b);
    }

    public final int hashCode() {
        int iHashCode = this.f64222a.hashCode() * 31;
        C38977v3 c38977v3 = this.f64223b;
        return iHashCode + (c38977v3 == null ? 0 : c38977v3.hashCode());
    }

    public final String toString() {
        return "Card(card=" + this.f64222a + ", billingDetails=" + this.f64223b + ")";
    }
}
