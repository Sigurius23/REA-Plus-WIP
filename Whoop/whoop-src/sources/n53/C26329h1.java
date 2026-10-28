package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.h1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26329h1 {

    /* JADX INFO: renamed from: a */
    public final String f104658a;

    public C26329h1(String sctpmapNumber) {
        AbstractC22676k.m65750j(sctpmapNumber, "sctpmapNumber");
        this.f104658a = sctpmapNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26329h1) && AbstractC22676k.m65745e(this.f104658a, ((C26329h1) obj).f104658a);
    }

    public final int hashCode() {
        return this.f104658a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpSctpmap(sctpmapNumber=", this.f104658a, ")");
    }
}
