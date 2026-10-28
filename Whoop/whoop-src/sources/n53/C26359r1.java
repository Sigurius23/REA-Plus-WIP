package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.r1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26359r1 {

    /* JADX INFO: renamed from: a */
    public final String f104776a;

    public C26359r1(String clksrc) {
        AbstractC22676k.m65750j(clksrc, "clksrc");
        this.f104776a = clksrc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26359r1) && AbstractC22676k.m65745e(this.f104776a, ((C26359r1) obj).f104776a);
    }

    public final int hashCode() {
        return this.f104776a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpTsrefclocks(clksrc=", this.f104776a, ")");
    }
}
