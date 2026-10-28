package n53;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.n1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26347n1 {

    /* JADX INFO: renamed from: a */
    public final String f104693a;

    /* JADX INFO: renamed from: b */
    public final String f104694b;

    public C26347n1(String semantics, String ssrcs) {
        AbstractC22676k.m65750j(semantics, "semantics");
        AbstractC22676k.m65750j(ssrcs, "ssrcs");
        this.f104693a = semantics;
        this.f104694b = ssrcs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26347n1)) {
            return false;
        }
        C26347n1 c26347n1 = (C26347n1) obj;
        return AbstractC22676k.m65745e(this.f104693a, c26347n1.f104693a) && AbstractC22676k.m65745e(this.f104694b, c26347n1.f104694b);
    }

    public final int hashCode() {
        return this.f104694b.hashCode() + (this.f104693a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("SdpSsrcgroups(semantics=", this.f104693a, ", ssrcs=", this.f104694b, ")");
    }
}
