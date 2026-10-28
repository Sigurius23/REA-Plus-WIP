package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26352p0 {

    /* JADX INFO: renamed from: a */
    public final String f104765a;

    public C26352p0(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        this.f104765a = id4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26352p0) && AbstractC22676k.m65745e(this.f104765a, ((C26352p0) obj).f104765a);
    }

    public final int hashCode() {
        return this.f104765a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpMediaclk(id=", this.f104765a, ")");
    }
}
